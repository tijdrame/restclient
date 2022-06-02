package com.emard.restclient.designpattern.factorypattern.pizza.impl;

import com.emard.restclient.designpattern.factorypattern.pizza.interf.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {

	public ChicagoStyleCheesePizza() { 
		name = "Chicago Style Deep Dish Cheese Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
 
		toppings.add("Shredded Mozzarella Cheese");
	}
 
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
