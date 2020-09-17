package com.web.coviddash.controller;

import com.web.coviddash.service.CovidService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import static com.web.coviddash.common.ApplicationConstants.*;


/**
 * @author Mathan Raj O
 * @version 1.0
 * @since 15-09-2020
 */
@Controller
@AllArgsConstructor
@Slf4j
public class CovidController {

    private final CovidService covidService;

    @GetMapping(DASH)
    public String getDashData(Model model){
        log.info("Request received:Covid Data:CovidController:getStateWiseData()");
        model.addAttribute("statewise",covidService.getStateTotal());
        model.addAttribute("stateWithoutTotal",covidService.getStateWiseWithoutTotal());
        return "dash";

    }

    @GetMapping(CHART)
    public String getChartData(Model model){
        log.info("Request received:Covid Data:CovidController:getChartData");
        model.addAttribute("barChart",covidService.getTop10StateByConfirmed());
        model.addAttribute("pieChart",covidService.getTopStatesWithLessDeaths());
        model.addAttribute("horChart",covidService.getTop5BasedOnRecovery());
        model.addAttribute("lineChart",covidService.getDailySummary());
        return "chart";

    }

    @GetMapping(SYMPTOM)
    public String goToSymptoms()
    {
        log.info("Request Received for the Symptoms Page:inside goToSymptoms()");
        return "symptom";
    }




}
