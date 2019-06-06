/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockproject.data;

import com.stockproject.model.Stock;
import com.stockproject.model.StockOfDay;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jolita
 */
public class DataLoader implements DataLoaderI {

    @Override
    public Stock loadData() {
        List<StockOfDay> data = new ArrayList<>();
        data.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 13), 0.473, 0.469, 0.473));
        data.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 14), 0.469, 0.460, 0.469));
        data.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 15), 0.460, 0.463, 0.466));
        data.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 16), 0.464, 0.463, 0.465));
        data.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 17), 0.464, 0.462, 0.466));
        data.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 20), 0.464, 0.460, 0.465));
        data.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 21), 0.461, 0.462, 0.464));
        data.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 22), 0.464, 0.458, 0.465));
        data.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 23), 0.460, 0.457, 0.462));
        data.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 24), 0.457, 0.450, 0.457));
        data.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 27), 0.457, 0.452, 0.457));
        data.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 28), 0.455, 0.456, 0.469));
        data.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 29), 0.462, 0.454, 0.463));
        data.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 30), 0.455, 0.454, 0.459));
        data.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 31), 0.459, 0.457, 0.460));
        data.add(new StockOfDay(LocalDate.of(2019, Month.JUNE, 3), 0.460, 0.460, 0.461));
        data.add(new StockOfDay(LocalDate.of(2019, Month.JUNE, 4), 0.460, 0.459, 0.463));
        data.add(new StockOfDay(LocalDate.of(2019, Month.JUNE, 5), 0.459, 0.459, 0.463));
        data.add(new StockOfDay(LocalDate.of(2019, Month.JUNE, 6), 0.459, 0.457, 0.459));
        return new Stock("SAB1L", data);
    }

    
}
