package com.web.coviddash.dto;
import com.fasterxml.jackson.annotation.JsonProperty;

/**Statewise DTO
 * @author Mathan Raj O
 * @version 1.0
 * @since 15-09-2020
 */
public class Statewise {
    @JsonProperty("active")
    public int getActive() {
        return this.active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    int active;

    @JsonProperty("confirmed")
    public int getConfirmed() {
        return this.confirmed;
    }

    public void setConfirmed(int confirmed) {
        this.confirmed = confirmed;
    }

    int confirmed;

    @JsonProperty("deaths")
    public int getDeaths() {
        return this.deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    int deaths;

    @JsonProperty("deltaconfirmed")
    public String getDeltaconfirmed() {
        return this.deltaconfirmed;
    }

    public void setDeltaconfirmed(String deltaconfirmed) {
        this.deltaconfirmed = deltaconfirmed;
    }

    String deltaconfirmed;

    @JsonProperty("deltadeaths")
    public String getDeltadeaths() {
        return this.deltadeaths;
    }

    public void setDeltadeaths(String deltadeaths) {
        this.deltadeaths = deltadeaths;
    }

    String deltadeaths;

    @JsonProperty("deltarecovered")
    public String getDeltarecovered() {
        return this.deltarecovered;
    }

    public void setDeltarecovered(String deltarecovered) {
        this.deltarecovered = deltarecovered;
    }

    String deltarecovered;

    @JsonProperty("lastupdatedtime")
    public String getLastupdatedtime() {
        return this.lastupdatedtime;
    }

    public void setLastupdatedtime(String lastupdatedtime) {
        this.lastupdatedtime = lastupdatedtime;
    }

    String lastupdatedtime;

    @JsonProperty("migratedother")
    public String getMigratedother() {
        return this.migratedother;
    }

    public void setMigratedother(String migratedother) {
        this.migratedother = migratedother;
    }

    String migratedother;

    @JsonProperty("recovered")
    public int getRecovered() {
        return this.recovered;
    }

    public void setRecovered(int recovered) {
        this.recovered = recovered;
    }

    int recovered;

    @JsonProperty("state")
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    String state;

    @JsonProperty("statecode")
    public String getStatecode() {
        return this.statecode;
    }

    public void setStatecode(String statecode) {
        this.statecode = statecode;
    }

    String statecode;

    @JsonProperty("statenotes")
    public String getStatenotes() {
        return this.statenotes;
    }

    public void setStatenotes(String statenotes) {
        this.statenotes = statenotes;
    }

    String statenotes;
}
