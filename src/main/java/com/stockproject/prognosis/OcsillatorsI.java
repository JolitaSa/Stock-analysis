/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockproject.prognosis;

import com.stockproject.model.FastOcsCalcResult;
import com.stockproject.model.SlowOcsCalcResult;
import com.stockproject.model.Stock;

/**
 *
 * @author Jolita
 */
public interface OcsillatorsI {

    FastOcsCalcResult fastOcs(Stock stock);

    SlowOcsCalcResult slowOcs(FastOcsCalcResult fastOcs);


}
