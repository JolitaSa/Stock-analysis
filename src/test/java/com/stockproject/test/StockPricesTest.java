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
import com.stockproject.model.Stock;
import com.stockproject.model.StockOfDay;
import com.stockproject.prognosis.Ocsillators;
import com.stockproject.prognosis.StockLastsPrint;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class StockPricesTest {
    
    private StockLastsPrint lasts = new StockLastsPrint();
    private TempDataLoader st = new TempDataLoader();
    private List<StockOfDay> dataT = null;
    private Stock stock = new Stock();
    private Ocsillators oscillators = new Ocsillators();

    
    @Before
    public void loadInit() {
        
        List<StockOfDay> dataT = new ArrayList<>();
        dataT.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 13), 0.473, 0.469, 0.473));
        dataT.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 14), 0.469, 0.460, 0.469));
        dataT.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 15), 0.460, 0.463, 0.466));
        dataT.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 16), 0.464, 0.463, 0.465));
        dataT.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 17), 0.464, 0.462, 0.466));
        dataT.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 20), 0.464, 0.460, 0.465));
        dataT.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 21), 0.461, 0.462, 0.464));
        dataT.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 22), 0.464, 0.458, 0.465));
        dataT.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 23), 0.460, 0.457, 0.462));
        dataT.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 24), 0.457, 0.450, 0.457));
    }
    
    @Test
    public void loadData() {
        st.loadData();
        Assert.assertNotNull(dataT);
    }
    
    @Test
    public void loadPricesL() {
        lasts.loadPricesL();
        Assert.assertNotNull(lasts);
    }
    
//    @Test
//    public void fastOcs() {
//        Double elK = oscillators.fastOcs(stock).get(0);
//        Assert.assertTrue( elK > 0 && elK >= 100);
//    }
//    
//    @Test
//    public void slowOcs() {
//        Double elD = oscillators.slowOcs(fastOcs);
//        Assert.assertTrue(elD > 0 && elD >= 100);
//    }
}
