package com.emard.restclient.designpattern.factorypattern.pizza.impl;

import com.emard.restclient.designpattern.factorypattern.pizza.interf.Pizza;

public class ClamPizza extends Pizza{
    
    public ClamPizza() {
		name = "Clam Pizza";
		dough = "Thin crust";
		sauce = "White garlic sauce";
		toppings.add("Clams");
		toppings.add("Grated parmesan cheese");
	}
}
