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
public class TempDataLoader implements DataLoaderI {

    @Override
    public Stock loadData() {
        List<StockOfDay> data = new ArrayList<>();
        data.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 13), 1.473, 1.000, 2.473));
        data.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 14), 1.469, 1.000, 2.469));
        data.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 15), 1.460, 1.000, 2.466));
        data.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 16), 1.464, 1.000, 2.465));
        data.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 17), 1.464, 1.100, 2.466));
        data.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 20), 1.464, 1.200, 2.465));
        data.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 21), 1.461, 1.100, 2.464));
        data.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 22), 1.464, 1.000, 2.465));
        data.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 23), 1.460, 1.000, 2.462));
        data.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 24), 1.457, 1.000, 2.457));
        data.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 27), 1.457, 1.000, 2.457));
        data.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 28), 1.455, 1.100, 2.469));
        data.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 29), 1.462, 1.100, 2.463));
        data.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 30), 1.455, 1.100, 2.459));
        data.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 31), 1.459, 1.000, 2.460));
        data.add(new StockOfDay(LocalDate.of(2019, Month.JUNE, 3), 1.460, 1.000, 2.461));
        data.add(new StockOfDay(LocalDate.of(2019, Month.JUNE, 4), 1.432, 1.000, 2.430));
        data.add(new StockOfDay(LocalDate.of(2019, Month.JUNE, 5), 1.425, 1.000, 2.425));
        data.add(new StockOfDay(LocalDate.of(2019, Month.JUNE, 6), 1.410, 1.000, 2.411));
        return new Stock("SAB-temp", data);
    }

    








































}
