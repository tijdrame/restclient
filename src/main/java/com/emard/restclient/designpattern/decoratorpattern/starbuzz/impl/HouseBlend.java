package com.emard.restclient.designpattern.decoratorpattern.starbuzz.impl;

import com.emard.restclient.designpattern.decoratorpattern.starbuzz.interf.Beverage;

public class HouseBlend extends Beverage{

    public HouseBlend() {
        description = "House Blend Coffee";
    }
    @Override
    public double cost() {
        return .89;
    }
    
}
