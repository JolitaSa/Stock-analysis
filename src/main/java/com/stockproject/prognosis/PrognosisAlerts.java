/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockproject.prognosis;

import com.stockproject.model.FastOcsCalcResult;
import com.stockproject.model.SlowOcsCalcResult;


/**
 *
 * @author Jolita
 */
public class PrognosisAlerts {

    private int periodLow = 20;
    private int periodHigh = 80;

    public void prognosisAlert(FastOcsCalcResult fastOcs, SlowOcsCalcResult slowOcs) {

        if ((slowOcs.getResultD1() == (fastOcs.getLastDayK())) && (fastOcs.getOneDayBeforeK() < slowOcs.getResultD2()
                && (fastOcs.getTwoDaysBeforeK() < slowOcs.getResultD3()) && (slowOcs.getResultD1() < periodLow) && (fastOcs.getLastDayK() < periodLow))) {
            System.out.println("BUY recommendation");
        } else if ((slowOcs.getResultD1() < periodLow) && (fastOcs.getLastDayK() < periodLow)) {
            System.out.println("The stock has reached LOW period");
        } else if ((slowOcs.getResultD1() == (fastOcs.getLastDayK())) && (fastOcs.getOneDayBeforeK() > slowOcs.getResultD2())
                && (fastOcs.getTwoDaysBeforeK() > slowOcs.getResultD3()) && (slowOcs.getResultD1() > periodHigh) && (fastOcs.getLastDayK() > periodHigh)) {
            System.out.println("SELL recommendation");
        } else if ((slowOcs.getResultD1() > periodHigh) && (fastOcs.getLastDayK() > periodHigh)) {
            System.out.println("The stock has reached HIGH period");
        } else {
            System.out.println("Today no signals");
        }

    }

}
