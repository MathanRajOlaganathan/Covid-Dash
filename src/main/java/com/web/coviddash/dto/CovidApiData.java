package com.web.coviddash.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author Mathan Raj O
 * @version 1.0
 * @since 15-09-2020
 */
public class CovidApiData {
    @JsonProperty("cases_time_series")
    public List<CasesTimeSeries> getCases_time_series() {
        return this.cases_time_series;
    }

    public void setCases_time_series(List<CasesTimeSeries> cases_time_series) {
        this.cases_time_series = cases_time_series;
    }

    List<CasesTimeSeries> cases_time_series;

    @JsonProperty("statewise")
    public List<Statewise> getStatewise() {
        return this.statewise;
    }

    public void setStatewise(List<Statewise> statewise) {
        this.statewise = statewise;
    }

    List<Statewise> statewise;

    @JsonProperty("tested")
    public List<Tested> getTested() {
        return this.tested;
    }

    public void setTested(List<Tested> tested) {
        this.tested = tested;
    }

    List<Tested> tested;
}
