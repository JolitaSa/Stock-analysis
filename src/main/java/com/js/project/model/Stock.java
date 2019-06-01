/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.js.project.model;

import com.js.project.model.StockOfDay;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jolita
 */
public class Stock {

    private String name;
    private List<StockOfDay> data = new ArrayList<>();

    public Stock(String name, List<StockOfDay> data) {
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public List<StockOfDay> getData() {
        return data;
    }

    public void setData(List<StockOfDay> data) {
        this.data = data;
    }
}
