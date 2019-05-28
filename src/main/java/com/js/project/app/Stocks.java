/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.js.project.app;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jolita
 */
public abstract class Stocks implements StockI {

    private Double changePerc;
    private Double userInput; // set? o GET nereikia?
    private EnmIncrDecr color = EnmIncrDecr.GREY;
    private List<Double> pLast;// kaip padaryti, kad priceLast ir changePercent duomenys ateitu nuolat? - veliau
    private List<Double> pMin;
    private List<Double> pMax;
    private List<Double> slowOsc;
    private List<Double> fastOsc;

//    @Override
//    public void alert() {
//        if (userInput == priceLast) {
//            System.out.println("Stock price has just reached your set limit." + "sound" + "pop-up");
//        }
    

}
