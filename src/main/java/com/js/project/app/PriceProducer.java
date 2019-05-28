/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.js.project.app;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jolita
 */
public class PriceProducer {

    public List<Double> fastOsc(List<Double> pLast, List<Double> pMin, List<Double> pMax) {
        double pMin1 = ((pMin.get(pMin.size() - 1)) + (pMin.get(pMin.size() - 2)) + (pMin.get(pMin.size() - 3)) + (pMin.get(pMin.size() - 4))
                + (pMin.get(pMin.size() - 5))) / 5;
        double pMin2 = ((pMin.get(pMin.size() - 2)) + (pMin.get(pMin.size() - 3)) + (pMin.get(pMin.size() - 4)) + (pMin.get(pMin.size() - 5))
                + (pMin.get(pMin.size() - 6))) / 5;
        double pMin3 = ((pMin.get(pMin.size() - 3)) + (pMin.get(pMin.size() - 4)) + (pMin.get(pMin.size() - 5)) + (pMin.get(pMin.size() - 6))
                + (pMin.get(pMin.size() - 7))) / 5;
        double pMax1 = ((pMax.get(pMax.size() - 1)) + (pMax.get(pMax.size() - 2)) + (pMax.get(pMax.size() - 3)) + (pMax.get(pMax.size() - 4))
                + (pMax.get(pMax.size() - 5))) / 5;
        double pMax2 = ((pMax.get(pMax.size() - 2)) + (pMax.get(pMax.size() - 3)) + (pMax.get(pMax.size() - 4)) + (pMax.get(pMax.size() - 5))
                + (pMax.get(pMax.size() - 6))) / 5;
        double pMax3 = ((pMax.get(pMax.size() - 3)) + (pMax.get(pMax.size() - 4)) + (pMax.get(pMax.size() - 5)) + (pMax.get(pMax.size() - 6))
                + (pMax.get(pMax.size() - 7))) / 5;
        double resultK1 = ((pLast.get(pLast.size() - 1)) - pMin1) / (pMax1 - pMin1) * 100.0; // %K=100*(Price-L5)/(H5-L5)}
        double resultK2 = ((pLast.get(pLast.size() - 2)) - pMin2) / (pMax2 - pMin2) * 100.0; 
        double resultK3 = ((pLast.get(pLast.size() - 3)) - pMin3) / (pMax3 - pMin3) * 100.0; 
        List<Double> fastOsc = new ArrayList<>();
        fastOsc.add(resultK3);
        fastOsc.add(resultK2);
        fastOsc.add(resultK1);
        return fastOsc;
    }

    public List<Double> slowOsc(List<Double> fastOsc) {
        double resultD = ((fastOsc.get(fastOsc.size() - 1)) + (fastOsc.get(fastOsc.size() - 2)) + (fastOsc.get(fastOsc.size() - 3))) / 3; //%D=((K1+K2+K3)/3
        List<Double> slowOsc = new ArrayList<>();
        slowOsc.add(resultD);
        return slowOsc;
    }
}
