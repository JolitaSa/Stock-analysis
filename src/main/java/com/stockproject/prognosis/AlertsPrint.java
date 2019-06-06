/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockproject.prognosis;

/**
 *
 * @author Jolita
 */
public class AlertsPrint {

    public void alert(AlertsEnm alerts) {
        switch (alerts) {
            case BUY:
                System.out.println("BUY");
                break;
            case SELL:
                System.out.println("SELL");
                break;
            case HIGH_PERIOD:
                System.out.println("HIGH PERIOD");
                break;
            case LOW_PERIOD:
                System.out.println("LOW PERIOD");
                break;
            case NO_SIGNAL:
                System.out.println("NO SIGNAL");
                break;

        }
    }
}
