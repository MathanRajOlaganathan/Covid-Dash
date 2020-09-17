package com.web.coviddash.service;

import com.web.coviddash.dto.CasesTimeSeries;
import com.web.coviddash.dto.Statewise;
import com.web.coviddash.dto.Tested;
import com.web.coviddash.dto.ZingChartData;
import java.util.List;
import java.util.Map;

/**
 * @author Mathan Raj O
 * @version 1.0
 * @since 15-09-2020
 */
public interface CovidService {

    public List<Statewise> getStateWiseData();

    public List<Tested> getTestedData();

    public List<CasesTimeSeries> getTimeSeriesData();

    public List<Statewise> getStateWiseWithoutTotal();

    public Statewise getStateTotal();

    public Map<String, Integer> getTop10StateByConfirmed();

    public Map<String, Integer> getTopStatesWithLessDeaths();

    public Map<String, Integer> getTop5BasedOnRecovery();

    public Map<String, Integer> getDailySummary();

    public List<ZingChartData> getMapData();
}
