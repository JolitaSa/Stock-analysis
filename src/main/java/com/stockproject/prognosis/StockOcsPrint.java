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
public class StockOcsPrint {

    public void printFastOcs(FastOcsCalcResult fastOcs) {

        System.out.println(fastOcs.getFourDaysBeforeK());
        System.out.println(fastOcs.getThreeDaysBeforeK());
        System.out.println(fastOcs.getTwoDaysBeforeK());
        System.out.println(fastOcs.getOneDayBeforeK());
        System.out.println(fastOcs.getLastDayK());

    }

    public void printSlowOcs(SlowOcsCalcResult slowOcs) {

        System.out.println(slowOcs.getResultD3());
        System.out.println(slowOcs.getResultD2());
        System.out.println(slowOcs.getResultD1());
    }
}
