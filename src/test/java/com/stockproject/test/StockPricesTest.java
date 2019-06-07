/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockproject.test;

/**
 *
 * @author Jolita
 */
import com.stockproject.data.LoaderFactory;
import com.stockproject.data.TempDataLoader;
import com.stockproject.model.Stock;
import com.stockproject.model.StockOfDay;
import com.stockproject.prognosis.AlertsEnm;
import com.stockproject.prognosis.Ocsillators;
import com.stockproject.prognosis.PrognosisAlerts;
import com.stockproject.prognosis.StockLastsPrint;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class StockPricesTest {

    private StockLastsPrint lasts = new StockLastsPrint();
    private TempDataLoader st = new TempDataLoader();
    private List<StockOfDay> dataT = null;
//    private Stock stock = new Stock();
    private Ocsillators ocs = new Ocsillators();
    private PrognosisAlerts alert = new PrognosisAlerts();
    private double checkOcsK = 63.27;
    private double checkOcsD = 82.63;

    Stock stock = LoaderFactory.loadData(false);

    @Test
    public void printPricesL() {
        lasts.printPricesL(stock);
        Assert.assertNotNull(lasts);
    }

    @Test
    public void fastOcs() {
        double ocsK = ocs.fastOcs(stock).getLastDayK();
        Assert.assertTrue(Math.abs(checkOcsK - ocsK) < 0.1);
    }

    @Test
    public void slowOcs() {
        double ocsD = ocs.slowOcs(ocs.fastOcs(stock)).getResultD1();
        Assert.assertTrue(Math.abs(checkOcsD - ocsD) < 0.1);
    }

    @Test
    public void prognosisAlert() {
        AlertsEnm al = alert.prognosisAlert(ocs.fastOcs(stock), ocs.slowOcs(ocs.fastOcs(stock)));
        Assert.assertEquals(AlertsEnm.NO_SIGNAL, al);
        Assert.assertNotEquals(AlertsEnm.HIGH_PERIOD, al);
    }
}
