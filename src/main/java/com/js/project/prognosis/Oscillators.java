/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.js.project.prognosis;

import com.js.project.model.Stock;
import com.js.project.model.StockOfDay;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

/**
 *
 * @author Jolita
 */
public class Oscillators {

    public Double fastOsc(Stock stock) {
// fastOsc:   %K=100*(pLast-pMinM)/(pMaxM-pMinM)

        List<Double> lastFive = getLastFive(stock.getData(), StockOfDay::getpMin);
        Double minValue = Collections.min(lastFive);
        lastFive = getLastFive(stock.getData(), StockOfDay::getpMax);
        Double maxValue = Collections.max(lastFive);
        Double lastValue = stock.getData().get(stock.getData().size() - 1).getpLast();
        
        Double resultK = ((lastValue - minValue) / (maxValue - minValue)) * 100;

        return resultK;
    }

    private List<Double> getLastFive(List<StockOfDay> data, Function<StockOfDay, Double> f) {
        List<Double> result = new ArrayList<>();

        for (int i = data.size(); i > 0; --i) {
            result.add(f.apply(data.get(i)));
            if (result.size() <= 5) {
                break;
            }
        }
        return result;
    }

    public Double slowOsc(List<Double> fastOsc) {
//        double resultD = (resultK1 + resultK2 + resultK3) / 3; //%D=((K1+K2+K3)/3
//        return resultD;
    }
}
