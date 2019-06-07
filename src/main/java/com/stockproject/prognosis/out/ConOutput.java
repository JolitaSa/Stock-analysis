/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockproject.prognosis.out;

import com.stockproject.model.FastOcsCalcResult;
import com.stockproject.model.SlowOcsCalcResult;
import com.stockproject.model.Stock;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jolita
 */
public class ConOutput implements Output {

    @Override
    public void msg(String txt) {
        System.out.println(txt);
    }

    @Override
    public void printFastOcs(FastOcsCalcResult fastOcs) {
        System.out.println(fastOcs.getLastDayK());
        System.out.println(fastOcs.getOneDayBeforeK());
        System.out.println(fastOcs.getTwoDaysBeforeK());
        System.out.println(fastOcs.getThreeDaysBeforeK());
        System.out.println(fastOcs.getFourDaysBeforeK());

    }

    @Override
    public void printSlowOcs(SlowOcsCalcResult slowOcs) {

        System.out.println(slowOcs.getResultD1());
        System.out.println(slowOcs.getResultD2());
        System.out.println(slowOcs.getResultD3());
                
    }

    @Override
    public void printPricesL(Stock stock) {

        List<Double> lastP = new ArrayList<>();
        int size = stock.getData().size();
        for (int i = 0; i < size; i++) {
            lastP.add(stock.getData().get(i).getpLast());
            System.out.println(lastP.get(i));
        }
    }
}
