package com.web.coviddash.serviceimpl;

import com.web.coviddash.dto.*;
import com.web.coviddash.service.CovidService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import javax.net.ssl.SSLException;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


/**
 * @author Mathan Raj O
 * @version 1.0
 * @since 15-09-2020
 */
@Service
@Slf4j
public class CovidDataService implements CovidService {

    private RestTemplate restTemplate;

    @Autowired
    public CovidDataService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Value("${covid.url}")
    private String covidUrl;

    private CovidApiData covidApiData;

    @PostConstruct
    @Scheduled(cron = "* * 1 * * *")
    private void fetchCovidData() {
        log.info("Fetching the Covid Data");
        covidApiData = restTemplate.getForObject(covidUrl, CovidApiData.class);
    }

    @Override
    public List<Statewise> getStateWiseData() {
        log.info("Fetching the state wise Data:getStateWiseData");
        return covidApiData.getStatewise();
    }


    @Override
    public List<Tested> getTestedData() {
        log.info("Fetching the tested wise Data:getTestedData");
        return covidApiData.getTested();
    }

    @Override
    public List<CasesTimeSeries> getTimeSeriesData() {
        log.info("Fetching the time series Data:getTimeSeriesData");
        return covidApiData.getCases_time_series();
    }

    public Map<String,Integer> getTop10StateByConfirmed()
    {
        log.info("Fetching the time top 10 states based on confirmed cases Data:getTop10StateByConfirmed");
        Comparator<Statewise> comparator = Comparator.comparing(Statewise::getConfirmed).reversed();
        return getStateWiseData().stream().filter(s->!s.getState().equals("Total")).sorted(comparator).limit(10).collect(
                        LinkedHashMap::new,
                        (map, item) -> map.put(item.getState(),item.getConfirmed()),
                        Map::putAll);
    }

    public Map<String,Integer> getTopStatesWithLessDeaths()
    {
        log.info("Fetching the time top states based on fewer deaths:getTopStatesWithLessDeaths");
        Comparator<Statewise> comparator = Comparator.comparing(Statewise::getDeaths);
        return getStateWiseData().stream().sorted(comparator).limit(6).collect(
            LinkedHashMap::new,
            (map, item) -> map.put(item.getStatecode(),item.getActive()),
            Map::putAll);
    }

    public Map<String,Integer> getTop5BasedOnRecovery()
    {
        log.info("Fetching the time top 5 states based on Recovered cases deaths:getTop5BasedOnRecovery");
        Comparator<Statewise> comparator = Comparator.comparing(Statewise::getRecovered).reversed();
        return  getStateWiseWithoutTotal().stream().sorted(comparator).limit(5).collect(
                LinkedHashMap::new,
                (map, item) -> map.put(item.getState(),item.getRecovered()),
                Map::putAll);
    }
    public List<Statewise> getStateWiseWithoutTotal(){
        log.info("Fetching the state wise data without the total:getStateWiseWithoutTotal");
        return getStateWiseData().stream().filter(data->!data.getState().equals("Total")).collect(Collectors.toList());
    }

    public Statewise getStateTotal(){
        log.info("Fetching the state data total:getStateTotal");
        return  getStateWiseData().stream().filter(data->data.getState().equals("Total")).findFirst().get();
    }

    public Map<String,Integer> getDailySummary()
    {
        log.info("Fetching the confirmed cases summary:getDailySummary");
        Comparator<CasesTimeSeries> comparator = Comparator.comparing(CasesTimeSeries::getTotalconfirmed);
        return getTimeSeriesData().stream().sorted(comparator).collect(
                LinkedHashMap::new,
                (map, item) -> map.put(item.getDate(),item.getTotalconfirmed()),
                Map::putAll);
    }

    public List<ZingChartData> getMapData(){
        log.info("Fetching the map data:getMapData");
        return getStateWiseWithoutTotal().stream().map(ZingChartData::new).collect(Collectors.toList());
    }


}
