package com.emard.restclient.designpattern.decoratorpattern.starbuzz.impl;

import com.emard.restclient.designpattern.decoratorpattern.starbuzz.interf.Beverage;

public class DarkRoast extends Beverage {
    
    public DarkRoast() {
		description = "Dark Roast Coffee";
	}
 
	public double cost() {
		return .99;
	}
    
}
