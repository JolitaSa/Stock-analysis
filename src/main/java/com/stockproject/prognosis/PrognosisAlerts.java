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

    public AlertsEnm prognosisAlert(FastOcsCalcResult fastOcs, SlowOcsCalcResult slowOcs) {

        if ((slowOcs.getResultD1() == (fastOcs.getLastDayK())) && (fastOcs.getOneDayBeforeK() < slowOcs.getResultD2()
                && (fastOcs.getTwoDaysBeforeK() < slowOcs.getResultD3()) && (slowOcs.getResultD1() < periodLow) && (fastOcs.getLastDayK() < periodLow))) {
            return AlertsEnm.BUY;
        } else if ((slowOcs.getResultD1() < periodLow) && (fastOcs.getLastDayK() < periodLow)) {
            return AlertsEnm.LOW_PERIOD;
        } else if ((slowOcs.getResultD1() == (fastOcs.getLastDayK())) && (fastOcs.getOneDayBeforeK() > slowOcs.getResultD2())
                && (fastOcs.getTwoDaysBeforeK() > slowOcs.getResultD3()) && (slowOcs.getResultD1() > periodHigh) && (fastOcs.getLastDayK() > periodHigh)) {
            return AlertsEnm.SELL;
        } else if ((slowOcs.getResultD1() > periodHigh) && (fastOcs.getLastDayK() > periodHigh)) {
            return AlertsEnm.HIGH_PERIOD;
        } else {
            return AlertsEnm.NO_SIGNAL;
        }
    }

}
