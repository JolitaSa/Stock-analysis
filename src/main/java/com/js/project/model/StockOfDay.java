/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.js.project.model;

import java.time.LocalDate;

/**
 *
 * @author Jolita
 */
public class StockOfDay {

    private Double pLast;
    private Double pMin;
    private Double pMax;
    private LocalDate date = LocalDate.now(); //mow or end of the day?

    public StockOfDay(LocalDate date, Double pLast, Double pMin, Double pMax) {
        this.date = date;
        this.pLast = pLast;
        this.pMin = pMin;
        this.pMax = pMax;
    }

    public LocalDate getDate() {
        return date;
    }

    public Double getpLast() {
        return pLast;
    }

    public Double getpMin() {
        return pMin;
    }

    public Double getpMax() {
        return pMax;
    }

}
