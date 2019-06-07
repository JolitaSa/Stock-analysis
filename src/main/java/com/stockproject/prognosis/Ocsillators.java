/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockproject.prognosis;

import com.stockproject.model.FastOcsCalcResult;
import com.stockproject.model.SlowOcsCalcResult;
import com.stockproject.model.Stock;
import com.stockproject.model.StockOfDay;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

/**
 *
 * @author Jolita
 */
public class Ocsillators implements OcsillatorsI {

    @Override
    public FastOcsCalcResult fastOcs(Stock stock) {
        return new FastOcsCalcResult(calcFastOcs(stock, 0), calcFastOcs(stock, 1), calcFastOcs(stock, 2), calcFastOcs(stock, 3), calcFastOcs(stock, 4));
    }

    public Double calcFastOcs(Stock stock, int dayBefore) {
        // fastOsc:   %K=100*(pLast-pMinM)/(pMaxM-pMinM)
        Double minValue = calcExtremumFromLastFive(stock.getData(), dayBefore, StockOfDay::getpMin, Collections::min);
        Double maxValue = calcExtremumFromLastFive(stock.getData(), dayBefore, StockOfDay::getpMax, Collections::max);
        Double lastValue = selectLastP(stock.getData(), dayBefore);
        Double resultK = ((lastValue - minValue) / (maxValue - minValue)) * 100.00;
        return resultK;
    }

    public Double selectLastP(List<StockOfDay> data, int dayBefore) {
        List<Double> resultLast = new ArrayList<>();
        for (int i = (data.size() - dayBefore - 1); i >= 0; --i) {
            resultLast.add(data.get(data.size()-dayBefore-1).getpLast());
        }
        return resultLast.get(data.size() - dayBefore - 1);
    }

    public Double calcExtremumFromLastFive(List<StockOfDay> data, int dayBefore, Function<StockOfDay, Double> f, Function<List<Double>, Double> extremumFuntion) {
        List<Double> result = new ArrayList<>();

        for (int i = (data.size() - dayBefore - 1); i >= 0; --i) {
            result.add(f.apply(data.get(i)));
            if (result.size() <= 5) {
                break;
            }
        }
        return extremumFuntion.apply(result);
    }

    @Override
    public SlowOcsCalcResult slowOcs(FastOcsCalcResult fastOcs) {
//%D=((K1+K2+K3)/3
        double resultD1 = (fastOcs.getLastDayK() + fastOcs.getOneDayBeforeK() + fastOcs.getTwoDaysBeforeK()) / 3.00;
        double resultD2 = (fastOcs.getOneDayBeforeK() + fastOcs.getTwoDaysBeforeK() + fastOcs.getThreeDaysBeforeK()) / 3.00;
        double resultD3 = (fastOcs.getTwoDaysBeforeK() + fastOcs.getThreeDaysBeforeK() + fastOcs.getFourDaysBeforeK()) / 3.00;
        SlowOcsCalcResult slowD = new SlowOcsCalcResult(resultD1, resultD2, resultD3);

        return slowD;
    }

}
