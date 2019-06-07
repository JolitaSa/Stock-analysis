package com.stockproject.prognosis.out;

import com.stockproject.model.FastOcsCalcResult;
import com.stockproject.model.SlowOcsCalcResult;
import com.stockproject.model.Stock;

public interface Output {

    void msg(String txt);

    void printFastOcs(FastOcsCalcResult fastOcs);

    void printSlowOcs(SlowOcsCalcResult slowOcs);

    void printPricesL(Stock stock);

}
