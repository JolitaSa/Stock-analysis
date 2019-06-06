/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockproject.app;

import com.stockproject.data.DataLoader;
import com.stockproject.data.TempDataLoader;
import com.stockproject.model.FastOcsCalcResult;
import com.stockproject.model.SlowOcsCalcResult;
import com.stockproject.model.Stock;
import com.stockproject.model.StockOfDay;
import com.stockproject.prognosis.Ocsillators;
import com.stockproject.prognosis.PrognosisAlerts;
import com.stockproject.prognosis.StockLastsPrint;
import java.util.List;
import com.stockproject.prognosis.OcsillatorsI;
import com.stockproject.prognosis.StockOcsPrint;
import java.util.ArrayList;

/**
 *
 * @author Jolita
 */
public class AppProject {

    public static void main(String[] args) {
        
        StockLastsPrint l = new StockLastsPrint();
        l.loadPricesL();

        StockOcsPrint k = new StockOcsPrint();
        k.printFastOcs();

//        PrognosisAlerts alert = new PrognosisAlerts();
//        alert.prognosisAlert();
        
    }
}
