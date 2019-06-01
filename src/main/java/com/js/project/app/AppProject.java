/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.js.project.app;

import com.js.project.data.DataLoader;
import com.js.project.data.TempDataLoader;
import com.js.project.model.Stock;
import com.js.project.model.StockOfDay;
import com.js.project.prognosis.Oscillators;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Jolita
 */
public class AppProject {

    public static void main(String[] args) {

        DataLoader loader = new TempDataLoader();
        Stock stock = loader.loadData();
        
        Oscillators osc = new Oscillators();
        
        osc.fastOsc(stock);
        

        System.out.println();
    }

}
