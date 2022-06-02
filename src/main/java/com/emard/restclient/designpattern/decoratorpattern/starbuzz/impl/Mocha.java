package com.emard.restclient.designpattern.decoratorpattern.starbuzz.impl;

import com.emard.restclient.designpattern.decoratorpattern.starbuzz.interf.Beverage;
import com.emard.restclient.designpattern.decoratorpattern.starbuzz.interf.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    public Mocha (Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }
    
}
