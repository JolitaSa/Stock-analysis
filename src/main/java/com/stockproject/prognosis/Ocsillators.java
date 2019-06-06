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
        Double resultK = ((lastValue - minValue) / (maxValue - minValue)) * 100;
        return resultK;
    }

    public Double selectLastP(List<StockOfDay> data, int dayBefore) {
        List<Double> resultLast = new ArrayList<>();
        for (int i = data.size() - dayBefore; i > 0; --i) {
            resultLast.add(data.get(i).getpLast());
        }
        return resultLast.get(data.size() - dayBefore);
    }

    public Double calcExtremumFromLastFive(List<StockOfDay> data, int dayBefore, Function<StockOfDay, Double> f, Function<List<Double>, Double> extremumFuntion) {
        List<Double> result = new ArrayList<>();

        for (int i = data.size() - dayBefore; i > 0; --i) {
            result.add(f.apply(data.get(i)));
            if (result.size() <= 5) {
                break;
            }
        }
        return extremumFuntion.apply(result);
    }

    @Override
    public SlowOcsCalcResult slowOcs(FastOcsCalcResult fastOcs) {

        return new SlowOcsCalcResult(calcSlowOcs(fastOcs).get(0), calcSlowOcs(fastOcs).get(1), calcSlowOcs(fastOcs).get(2));
    }

    private List<Double> calcSlowOcs(FastOcsCalcResult fastOcs) {
//%D=((K1+K2+K3)/3
        Double resultD1 = (fastOcs.getLastDayK() + fastOcs.getOneDayBeforeK() + fastOcs.getTwoDaysBeforeK()) / 3;
        Double resultD2 = (fastOcs.getOneDayBeforeK() + fastOcs.getTwoDaysBeforeK() + fastOcs.getThreeDaysBeforeK()) / 3;
        Double resultD3 = (fastOcs.getTwoDaysBeforeK() + fastOcs.getThreeDaysBeforeK() + fastOcs.getFourDaysBeforeK()) / 3;
        List<Double> calcSlowOcsList = new ArrayList<>();
        calcSlowOcsList.add(resultD3);
        calcSlowOcsList.add(resultD2);
        calcSlowOcsList.add(resultD1);
        return calcSlowOcsList;

    }

}
