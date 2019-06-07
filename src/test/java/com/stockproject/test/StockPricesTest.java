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
import com.stockproject.model.Stock;
import com.stockproject.model.StockOfDay;
import com.stockproject.prognosis.AlertsEnm;
import com.stockproject.prognosis.Ocsillators;
import com.stockproject.prognosis.PrognosisAlerts;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StockPricesTest {

    private Ocsillators ocs = new Ocsillators();
    private PrognosisAlerts alert = new PrognosisAlerts();
    private double checkOcsK = 63.27;
    private double checkOcsD = 83.12;

    Stock stock = new Stock();

    @Before
    public void init() {
        List<StockOfDay> dataT = new ArrayList<>();
        dataT.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 28), 1.555, 1.400, 1.669));
        dataT.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 29), 1.662, 1.300, 1.763));
        dataT.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 30), 1.755, 1.400, 1.859));
        dataT.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 31), 1.859, 1.500, 1.960));
        dataT.add(new StockOfDay(LocalDate.of(2019, Month.JUNE, 3), 1.960, 1.550, 1.990));
        dataT.add(new StockOfDay(LocalDate.of(2019, Month.JUNE, 4), 1.970, 1.670, 1.990));
        dataT.add(new StockOfDay(LocalDate.of(2019, Month.JUNE, 5), 1.925, 1.650, 1.950));
        dataT.add(new StockOfDay(LocalDate.of(2019, Month.JUNE, 6), 1.810, 1.600, 1.940));
        stock.setData(dataT);
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
        Assert.assertEquals(AlertsEnm.MIDDLE_PERIOD, al);
        Assert.assertNotEquals(AlertsEnm.HIGH_PERIOD, al);
    }
}
