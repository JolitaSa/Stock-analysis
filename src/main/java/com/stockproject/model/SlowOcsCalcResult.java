/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockproject.model;

/**
 *
 * @author Jolita
 */
public class SlowOcsCalcResult {
    
    private double resultD1;
    private double resultD2;
    private double resultD3;

    public SlowOcsCalcResult(double resultD1, double resultD2, double resultD3) {
        this.resultD1 = resultD1;
        this.resultD2 = resultD2;
        this.resultD3 = resultD3;
    }

    
    public double getResultD1() {
        return resultD1;
    }

    public void setResultD1(double resultD1) {
        this.resultD1 = resultD1;
    }

    public double getResultD2() {
        return resultD2;
    }

    public void setResultD2(double resultD2) {
        this.resultD2 = resultD2;
    }

    public double getResultD3() {
        return resultD3;
    }

    public void setResultD3(double resultD3) {
        this.resultD3 = resultD3;
    }
    
    
}
