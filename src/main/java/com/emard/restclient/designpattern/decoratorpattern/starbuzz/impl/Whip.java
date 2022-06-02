package com.emard.restclient.designpattern.decoratorpattern.starbuzz.impl;

import com.emard.restclient.designpattern.decoratorpattern.starbuzz.interf.Beverage;
import com.emard.restclient.designpattern.decoratorpattern.starbuzz.interf.CondimentDecorator;

public class Whip extends CondimentDecorator{

    public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
    
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
    
}
