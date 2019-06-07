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
        data.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 13), 1.473, 1.000, 1.773));
        data.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 14), 1.469, 1.000, 1.669));
        data.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 15), 1.460, 1.000, 1.566));
        data.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 16), 1.464, 1.000, 1.765));
        data.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 17), 1.464, 1.100, 1.766));
        data.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 20), 1.464, 1.200, 1.865));
        data.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 21), 1.461, 1.400, 1.864));
        data.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 22), 1.464, 1.300, 1.865));
        data.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 23), 1.460, 1.300, 1.862));
        data.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 24), 1.457, 1.400, 1.657));
        data.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 27), 1.457, 1.400, 1.757));
        data.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 28), 1.555, 1.400, 1.669));
        data.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 29), 1.662, 1.300, 1.763));
        data.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 30), 1.755, 1.400, 1.859));
        data.add(new StockOfDay(LocalDate.of(2019, Month.MAY, 31), 1.859, 1.500, 1.960));
        data.add(new StockOfDay(LocalDate.of(2019, Month.JUNE, 3), 1.960, 1.550, 1.990));
        data.add(new StockOfDay(LocalDate.of(2019, Month.JUNE, 4), 1.970, 1.670, 1.990));
        data.add(new StockOfDay(LocalDate.of(2019, Month.JUNE, 5), 1.925, 1.650, 1.950));
        data.add(new StockOfDay(LocalDate.of(2019, Month.JUNE, 6), 1.810, 1.600, 1.940));
        return new Stock("SAB-temp", data);
    }

}
