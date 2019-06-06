/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockproject.prognosis;

import com.stockproject.model.FastOcsCalcResult;
import com.stockproject.model.Stock;

/**
 *
 * @author Jolita
 */
public class StockOcsPrint {


    public void printFastOcs(Stock stock) {

        Ocsillators fastOcsK = new Ocsillators();
        System.out.println(fastOcsK.fastOcs(stock).getFourDaysBeforeK());
        System.out.println(fastOcsK.fastOcs(stock).getThreeDaysBeforeK());
        System.out.println(fastOcsK.fastOcs(stock).getTwoDaysBeforeK());
        System.out.println(fastOcsK.fastOcs(stock).getOneDayBeforeK());
        System.out.println(fastOcsK.fastOcs(stock).getLastDayK());

    }

    public void printSlowOcs(FastOcsCalcResult fastOcs) {

        Ocsillators slowOcsK = new Ocsillators();
        System.out.println(slowOcsK.slowOcs(fastOcs).getResultD3());
        System.out.println(slowOcsK.slowOcs(fastOcs).getResultD2());
        System.out.println(slowOcsK.slowOcs(fastOcs).getResultD1());


    }
}
