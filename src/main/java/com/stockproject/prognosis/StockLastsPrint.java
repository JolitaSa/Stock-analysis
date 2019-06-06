/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockproject.prognosis;

import com.stockproject.data.DataLoader;
import com.stockproject.data.TempDataLoader;
import com.stockproject.model.Stock;
import com.stockproject.model.StockOfDay;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jolita
 */
public class StockLastsPrint {

    public void loadPricesL() {

        DataLoader load = new TempDataLoader();
        System.out.println(load.loadData().getName());
        
        List<Double> lastP = new ArrayList<>();
        int size = load.loadData().getData().size();
        for (int i = 0; i < size; i++) {
            lastP.add(load.loadData().getData().get(i).getpLast());
            System.out.println(lastP.get(i));
        }
    }
}