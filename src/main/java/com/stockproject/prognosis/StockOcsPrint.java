/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockproject.prognosis;

import com.stockproject.data.DataLoader;
import com.stockproject.data.TempDataLoader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jolita
 */
public class StockOcsPrint {

    public void printFastOcs() {

        DataLoader loader = new TempDataLoader();
        System.out.println("Values of fast ocsillator K for " + loader.loadData().getName() + " stock:");

        Ocsillators fastOcsK = new Ocsillators();
        List<Double> fastOcsKprint = new ArrayList<>();
        int size = loader.loadData().getData().size();
        System.out.println(fastOcsK.calcFastOcs(loader.loadData(), 1));
        for (int i = 0; i < size; i++) {
        fastOcsKprint.add(fastOcsK.calcFastOcs(loader.loadData(), i));
        System.out.println(fastOcsKprint.get(i));
        }
    }
    
    public void printSlowOcs() {

}
}
