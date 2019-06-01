/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.js.project.data;

import com.js.project.model.Stock;
import com.js.project.model.StockOfDay;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jolita
 */
public interface DataLoader {

    Stock loadData();

   
}
