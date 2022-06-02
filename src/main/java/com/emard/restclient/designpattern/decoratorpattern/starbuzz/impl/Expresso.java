package com.emard.restclient.designpattern.decoratorpattern.starbuzz.impl;

import com.emard.restclient.designpattern.decoratorpattern.starbuzz.interf.Beverage;

public class Expresso extends Beverage {

    public Expresso() {
        description = "Expresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
    
}
