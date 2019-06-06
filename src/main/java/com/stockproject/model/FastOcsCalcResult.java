/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockproject.model;

/**
 *
 * @author Jolita
 */
public class FastOcsCalcResult {
    
   private double lastDayK;
   private double oneDayBeforeK;
   private double twoDaysBeforeK;
   double threeDaysBeforeK;
   double fourDaysBeforeK;

    public FastOcsCalcResult(double lastDayK, double oneDayBeforeK, double twoDaysBeforeK, double threeDaysBeforeK, double fourDaysBeforeK) {
        this.lastDayK = lastDayK;
        this.oneDayBeforeK = oneDayBeforeK;
        this.twoDaysBeforeK = twoDaysBeforeK;
        this.threeDaysBeforeK = threeDaysBeforeK;
        this.fourDaysBeforeK = fourDaysBeforeK;
    }

    public double getLastDayK() {
        return lastDayK;
    }

    public void setLastDayK(double lastDayK) {
        this.lastDayK = lastDayK;
    }

    public double getOneDayBeforeK() {
        return oneDayBeforeK;
    }

    public void setOneDayBeforeK(double oneDayBeforeK) {
        this.oneDayBeforeK = oneDayBeforeK;
    }

    public double getTwoDaysBeforeK() {
        return twoDaysBeforeK;
    }

    public void setTwoDaysBeforeK(double twoDaysBeforeK) {
        this.twoDaysBeforeK = twoDaysBeforeK;
    }

    public double getThreeDaysBeforeK() {
        return threeDaysBeforeK;
    }

    public void setThreeDaysBeforeK(double threeDaysBeforeK) {
        this.threeDaysBeforeK = threeDaysBeforeK;
    }

    public double getFourDaysBeforeK() {
        return fourDaysBeforeK;
    }

    public void setFourDaysBeforeK(double fourDaysBeforeK) {
        this.fourDaysBeforeK = fourDaysBeforeK;
    }

    public Double get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    
}
