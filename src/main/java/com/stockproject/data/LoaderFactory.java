/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockproject.data;

import com.stockproject.model.Stock;

/**
 *
 * @author Jolita
 */
public class LoaderFactory {

    public static Stock loadData(boolean isDataReal) {
        if (isDataReal) {
            return new DataLoader().loadData();
        } else {
            return new TempDataLoader().loadData();
        }

    }

}
