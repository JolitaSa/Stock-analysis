/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockproject.data;

/**
 *
 * @author Jolita
 */
public class InstanceFactory {

    public static DataLoaderI createInstance(boolean isDataReal) {
        if (isDataReal) {
            return new DataLoader();
        } else {
            return new TempDataLoader();
        }

    }

}
