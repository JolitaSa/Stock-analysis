/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.js.project.data;

import com.js.project.model.Stock;
import com.js.project.model.StockOfDay;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jolita
 */
public class TempDataLoader implements DataLoader {

    @Override
    public Stock loadData() {
        List<StockOfDay> data = new ArrayList<>();
        data.add(new StockOfDay(LocalDate.of(2019, Month.JUNE, 1), 1.680, 1.609, 1.690));
        data.add(new StockOfDay(LocalDate.of(2019, Month.JUNE, 2), 1.680, 1.609, 1.690));
        data.add(new StockOfDay(LocalDate.of(2019, Month.JUNE, 3), 1.680, 1.609, 1.690));
        data.add(new StockOfDay(LocalDate.of(2019, Month.JUNE, 4), 1.680, 1.609, 1.690));
        data.add(new StockOfDay(LocalDate.of(2019, Month.JUNE, 5), 1.680, 1.609, 1.690));
        data.add(new StockOfDay(LocalDate.of(2019, Month.JUNE, 6), 1.680, 1.609, 1.690));
        data.add(new StockOfDay(LocalDate.of(2019, Month.JUNE, 7), 1.680, 1.609, 1.690));
        data.add(new StockOfDay(LocalDate.of(2019, Month.JUNE, 8), 1.680, 1.609, 1.690));
        data.add(new StockOfDay(LocalDate.of(2019, Month.JUNE, 9), 1.680, 1.609, 1.690));
        data.add(new StockOfDay(LocalDate.of(2019, Month.JUNE, 10), 1.680, 1.609, 1.690));
        return new Stock("APG", data);
    }

}
