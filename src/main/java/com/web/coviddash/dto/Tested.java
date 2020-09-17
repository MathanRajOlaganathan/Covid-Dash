package com.web.coviddash.dto;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Mathan Raj O
 * @version 1.0
 * @since 15-09-2020
 */
public class Tested {

    @JsonProperty("dailyrtpcrtests")
    public String getDailyrtpcrtests() {
        return this.dailyrtpcrtests;
    }

    public void setDailyrtpcrtests(String dailyrtpcrtests) {
        this.dailyrtpcrtests = dailyrtpcrtests;
    }

    String dailyrtpcrtests;

    @JsonProperty("individualstestedperconfirmedcase")
    public String getIndividualstestedperconfirmedcase() {
        return this.individualstestedperconfirmedcase;
    }

    public void setIndividualstestedperconfirmedcase(String individualstestedperconfirmedcase) {
        this.individualstestedperconfirmedcase = individualstestedperconfirmedcase;
    }

    String individualstestedperconfirmedcase;

    @JsonProperty("positivecasesfromsamplesreported")
    public String getPositivecasesfromsamplesreported() {
        return this.positivecasesfromsamplesreported;
    }

    public void setPositivecasesfromsamplesreported(String positivecasesfromsamplesreported) {
        this.positivecasesfromsamplesreported = positivecasesfromsamplesreported;
    }

    String positivecasesfromsamplesreported;

    @JsonProperty("samplereportedtoday")
    public String getSamplereportedtoday() {
        return this.samplereportedtoday;
    }

    public void setSamplereportedtoday(String samplereportedtoday) {
        this.samplereportedtoday = samplereportedtoday;
    }

    String samplereportedtoday;

    @JsonProperty("source")
    public String getSource() {
        return this.source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    String source;

    @JsonProperty("source1")
    public String getSource1() {
        return this.source1;
    }

    public void setSource1(String source1) {
        this.source1 = source1;
    }

    String source1;

    @JsonProperty("source3")
    public String getSource3() {
        return this.source3;
    }

    public void setSource3(String source3) {
        this.source3 = source3;
    }

    String source3;

    @JsonProperty("testedasof")
    public String getTestedasof() {
        return this.testedasof;
    }

    public void setTestedasof(String testedasof) {
        this.testedasof = testedasof;
    }

    String testedasof;

    @JsonProperty("testpositivityrate")
    public String getTestpositivityrate() {
        return this.testpositivityrate;
    }

    public void setTestpositivityrate(String testpositivityrate) {
        this.testpositivityrate = testpositivityrate;
    }

    String testpositivityrate;

    @JsonProperty("testsconductedbyprivatelabs")
    public String getTestsconductedbyprivatelabs() {
        return this.testsconductedbyprivatelabs;
    }

    public void setTestsconductedbyprivatelabs(String testsconductedbyprivatelabs) {
        this.testsconductedbyprivatelabs = testsconductedbyprivatelabs;
    }

    String testsconductedbyprivatelabs;

    @JsonProperty("testsperconfirmedcase")
    public String getTestsperconfirmedcase() {
        return this.testsperconfirmedcase;
    }

    public void setTestsperconfirmedcase(String testsperconfirmedcase) {
        this.testsperconfirmedcase = testsperconfirmedcase;
    }

    String testsperconfirmedcase;

    @JsonProperty("testspermillion")
    public String getTestspermillion() {
        return this.testspermillion;
    }

    public void setTestspermillion(String testspermillion) {
        this.testspermillion = testspermillion;
    }

    String testspermillion;

    @JsonProperty("totalindividualstested")
    public String getTotalindividualstested() {
        return this.totalindividualstested;
    }

    public void setTotalindividualstested(String totalindividualstested) {
        this.totalindividualstested = totalindividualstested;
    }

    String totalindividualstested;

    @JsonProperty("totalpositivecases")
    public String getTotalpositivecases() {
        return this.totalpositivecases;
    }

    public void setTotalpositivecases(String totalpositivecases) {
        this.totalpositivecases = totalpositivecases;
    }

    String totalpositivecases;

    @JsonProperty("totalrtpcrtests")
    public String getTotalrtpcrtests() {
        return this.totalrtpcrtests;
    }

    public void setTotalrtpcrtests(String totalrtpcrtests) {
        this.totalrtpcrtests = totalrtpcrtests;
    }

    String totalrtpcrtests;

    @JsonProperty("totalsamplestested")
    public String getTotalsamplestested() {
        return this.totalsamplestested;
    }

    public void setTotalsamplestested(String totalsamplestested) {
        this.totalsamplestested = totalsamplestested;
    }

    String totalsamplestested;

    @JsonProperty("updatetimestamp")
    public String getUpdatetimestamp() {
        return this.updatetimestamp;
    }

    public void setUpdatetimestamp(String updatetimestamp) {
        this.updatetimestamp = updatetimestamp;
    }

    String updatetimestamp;
}
