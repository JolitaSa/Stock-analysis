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
import com.stockproject.prognosis.Ocsillators;
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

        Ocsillators ocs = new Ocsillators();
        System.out.println("Fast ocsillator of last 5 days for stock " + stock.getName());
        StockOcsPrint fastOcsK = new StockOcsPrint();
        fastOcsK.printFastOcs(ocs.fastOcs(stock));

        System.out.println("Slow ocsillator of last 3 days for stock " + stock.getName());
        StockOcsPrint slowOcsD = new StockOcsPrint();
        slowOcsD.printSlowOcs(ocs.slowOcs(ocs.fastOcs(stock)));

        System.out.println("Trade signals for stock " + stock.getName());
        PrognosisAlerts pa = new PrognosisAlerts();
        System.out.println(pa.prognosisAlert(ocs.fastOcs(stock), ocs.slowOcs(ocs.fastOcs(stock))).toString());

    }
}
