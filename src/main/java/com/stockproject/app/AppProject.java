/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockproject.app;

import com.stockproject.model.Stock;
import com.stockproject.prognosis.StockLastsPrint;
import com.stockproject.prognosis.StockOcsPrint;
import com.stockproject.data.LoaderFactory;
import com.stockproject.model.FastOcsCalcResult;
import com.stockproject.model.SlowOcsCalcResult;
import com.stockproject.prognosis.AlertsEnm;
import com.stockproject.prognosis.AlertsPrint;
import com.stockproject.prognosis.PrognosisAlerts;


/**
 *
 * @author Jolita
 */
public class AppProject {

    public static void main(String[] args) {

        Stock stock = LoaderFactory.loadData(true);
        System.out.println();
        System.out.println(stock.getName() + " last stock prices:");

        StockLastsPrint lastPrices = new StockLastsPrint();
        lastPrices.printPricesL(stock);
        System.out.println();

        System.out.println("Fast ocsillator of last 5 days for stock " + stock.getName());
        StockOcsPrint fastOcsK = new StockOcsPrint();
        fastOcsK.printFastOcs(stock);
        
        
//        StockOcsPrint slowOcsD = new StockOcsPrint();
//        slowOcsD.printSlowOcs(fastOcs);
//
//        PrognosisAlerts pa = new PrognosisAlerts();
//        pa.prognosisAlert();
//        AlertsPrint al = new AlertsPrint();
//        al.alert(AlertsEnm.NO_SIGNAL);

    }
}
