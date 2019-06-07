package com.stockproject.prognosis.out;

public class OutputFactory {
    public static Output getInstance(boolean b) {

        if (b) {
            return  new ConOutput();
        }
        return new WinOutput();
    }
}
