/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockproject.app;

import com.stockproject.model.FastOcsCalcResult;
import com.stockproject.model.SlowOcsCalcResult;
import com.stockproject.model.Stock;
import com.stockproject.prognosis.out.Output;
import com.stockproject.prognosis.out.OutputFactory;
import com.stockproject.data.InstanceFactory;
import com.stockproject.prognosis.Ocsillators;
import com.stockproject.prognosis.PrognosisAlerts;

/**
 *
 * @author Jolita
 */
public class AppProject {

    public static void main(String[] args) {

        Output out = OutputFactory.getInstance(true);

        Stock stock = InstanceFactory.createInstance(false).loadData();

        out.msg(stock.getName() + " last stock prices:");

        out.printPricesL(stock);

        Ocsillators ocs = new Ocsillators();
        out.msg("Fast ocsillator of last 5 days for stock: " + stock.getName());

        FastOcsCalcResult fastOcs = ocs.fastOcs(stock);
        out.printFastOcs(fastOcs);

        out.msg("Slow ocsillator of last 3 days for stock: " + stock.getName());

        SlowOcsCalcResult slowOcs = ocs.slowOcs(fastOcs);
        out.printSlowOcs(slowOcs);

        out.msg("Trade signals for stock: " + stock.getName());
        PrognosisAlerts pa = new PrognosisAlerts();
        out.msg(pa.prognosisAlert(fastOcs, slowOcs).toString());

    }
}
