/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockproject.model;

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
        this.name = name;
        this.data = data;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Stock() {
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
