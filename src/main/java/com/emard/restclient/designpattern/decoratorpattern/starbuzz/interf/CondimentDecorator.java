package com.emard.restclient.designpattern.decoratorpattern.starbuzz.interf;

public abstract class CondimentDecorator extends Beverage {
    
    public Beverage beverage;
    public abstract String getDescription();

}
