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
import com.stockproject.data.TempDataLoader;
import com.stockproject.model.FastOcsCalcResult;
import com.stockproject.model.SlowOcsCalcResult;
import com.stockproject.model.Stock;
import com.stockproject.model.StockOfDay;
import com.stockproject.prognosis.AlertsEnm;
import com.stockproject.prognosis.Ocsillators;
import com.stockproject.prognosis.PrognosisAlerts;
import com.stockproject.prognosis.StockLastsPrint;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StockPricesTest {

    private StockLastsPrint lasts = new StockLastsPrint();
    private TempDataLoader st = new TempDataLoader();
    private List<StockOfDay> dataT = null;
    private Stock stock = new Stock();
    private Ocsillators oscillators = new Ocsillators();
    private PrognosisAlerts alert = new PrognosisAlerts();
    private FastOcsCalcResult fastOcs;
    private SlowOcsCalcResult slowOcs;
    private AlertsEnm a;
    

    @Before
    public void loadInit() {

        List<StockOfDay> dataT = new ArrayList<>();
        dataT.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 13), 2.0, 1.0, 4.0));
        dataT.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 14), 2.0, 1.0, 4.0));
        dataT.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 15), 2.0, 1.0, 4.0));
        dataT.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 16), 2.0, 1.0, 4.0));
        dataT.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 17), 2.0, 1.0, 4.0));
        dataT.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 20), 2.0, 1.0, 4.0));
        dataT.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 21), 2.0, 1.0, 4.5));
        dataT.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 22), 2.0, 1.0, 5.0));
        dataT.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 23), 2.0, 1.0, 4.0));
        dataT.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 24), 2.0, 1.0, 4.0));
    }

    @Test
    public void printPircesL() {
        lasts.printPricesL(stock);
        Assert.assertNotNull(lasts);
    }

    @Test
    public void fastOcs() {
        double elK = oscillators.fastOcs(st.loadData()).getLastDayK();
        Assert.assertTrue(Math.abs(25-elK)==0);
    }

    @Test
    public void slowOcs() {
        double elD = oscillators.slowOcs(fastOcs).getResultD1();
        Assert.assertTrue(Math.abs(25-elD)==0);
    }
    
   
}
