package com.emard.restclient.designpattern.factorypattern.pizza.impl;

import com.emard.restclient.designpattern.factorypattern.pizza.interf.Pizza;

public class PepperoniPizza extends Pizza {
    
    public PepperoniPizza() {
		name = "Pepperoni Pizza";
		dough = "Crust";
		sauce = "Marinara sauce";
		toppings.add("Sliced Pepperoni");
		toppings.add("Sliced Onion");
		toppings.add("Grated parmesan cheese");
	}
}
