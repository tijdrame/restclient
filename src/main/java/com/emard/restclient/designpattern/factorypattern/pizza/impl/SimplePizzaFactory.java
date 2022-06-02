package com.emard.restclient.designpattern.factorypattern.pizza.impl;

import com.emard.restclient.designpattern.factorypattern.pizza.interf.Pizza;

// pas vraiment un design pattern meme si bcp le considere comme tel
public class SimplePizzaFactory {
    
    public Pizza createPizza(String type) {
		Pizza pizza = null;

		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new ClamPizza();
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza();
		}
		return pizza;
	}
}
