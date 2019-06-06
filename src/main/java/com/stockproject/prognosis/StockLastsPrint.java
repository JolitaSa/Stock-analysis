/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockproject.prognosis;

import com.stockproject.model.Stock;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jolita
 */
public class StockLastsPrint {

    public void printPricesL(Stock stock) {

        List<Double> lastP = new ArrayList<>();
        int size = stock.getData().size();
        for (int i = 0; i < size; i++) {
            lastP.add(stock.getData().get(i).getpLast());
            System.out.println(lastP.get(i));
        }

        
    }
}
