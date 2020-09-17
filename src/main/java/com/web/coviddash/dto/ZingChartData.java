package com.web.coviddash.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.util.Date;


/**
 * @author Mathan Raj O
 * @version 1.0
 * @since 15-09-2020
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ZingChartData implements Serializable {

    private String stateName;
    private String stateCode;
    private String backGroundColor;
    private int activeCases;
    private int deaths;
    private int cured;
    private int totalCases;
    private String htmlText;
    private Date updatedOn;

    public ZingChartData(Statewise statewise){
        this.stateName = statewise.getState();
        this.stateCode = statewise.getStatecode();
        this.activeCases = statewise.getActive();
        this.deaths = statewise.getDeaths();
        this.cured = statewise.getRecovered();
        this.totalCases = statewise.getConfirmed();
        this.htmlText = statewise.getStatenotes();
    }
}
