package com.web.coviddash.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Mathan Raj O
 * @version 1.0
 * @since 15-09-2020
 */
public class CasesTimeSeries {
    @JsonProperty("dailyconfirmed")
    public String getDailyconfirmed() {
        return this.dailyconfirmed;
    }

    public void setDailyconfirmed(String dailyconfirmed) {
        this.dailyconfirmed = dailyconfirmed;
    }

    String dailyconfirmed;

    @JsonProperty("dailydeceased")
    public String getDailydeceased() {
        return this.dailydeceased;
    }

    public void setDailydeceased(String dailydeceased) {
        this.dailydeceased = dailydeceased;
    }

    String dailydeceased;

    @JsonProperty("dailyrecovered")
    public String getDailyrecovered() {
        return this.dailyrecovered;
    }

    public void setDailyrecovered(String dailyrecovered) {
        this.dailyrecovered = dailyrecovered;
    }

    String dailyrecovered;

    @JsonProperty("date")
    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    String date;

    @JsonProperty("totalconfirmed")
    public int getTotalconfirmed() {
        return this.totalconfirmed;
    }

    public void setTotalconfirmed(int totalconfirmed) {
        this.totalconfirmed = totalconfirmed;
    }

    int totalconfirmed;

    @JsonProperty("totaldeceased")
    public String getTotaldeceased() {
        return this.totaldeceased;
    }

    public void setTotaldeceased(String totaldeceased) {
        this.totaldeceased = totaldeceased;
    }

    String totaldeceased;

    @JsonProperty("totalrecovered")
    public String getTotalrecovered() {
        return this.totalrecovered;
    }

    public void setTotalrecovered(String totalrecovered) {
        this.totalrecovered = totalrecovered;
    }

    String totalrecovered;
}