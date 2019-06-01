/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.js.project.prognosis;

import java.time.LocalDate;


/**
 *
 * @author Jolita
 */
public interface DataGenerator {

    public LocalDate getDate();

    public Double getpLast();
    
    public Double getpMin();
  
    public Double getpMax();
    
     public String getName();
     

}
