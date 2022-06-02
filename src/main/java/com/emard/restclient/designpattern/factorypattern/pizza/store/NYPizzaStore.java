package com.emard.restclient.designpattern.factorypattern.pizza.store;

import com.emard.restclient.designpattern.factorypattern.pizza.impl.NYStyleCheesePizza;
import com.emard.restclient.designpattern.factorypattern.pizza.impl.NYStyleClamPizza;
import com.emard.restclient.designpattern.factorypattern.pizza.impl.NYStylePepperoniPizza;
import com.emard.restclient.designpattern.factorypattern.pizza.impl.NYStyleVeggiePizza;
import com.emard.restclient.designpattern.factorypattern.pizza.interf.Pizza;

public class NYPizzaStore extends PizzaStore{

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;

		if (type.equals("cheese")) {
			pizza = new NYStyleCheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new NYStylePepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new NYStyleClamPizza();
		} else if (type.equals("veggie")) {
			pizza = new NYStyleVeggiePizza();
		}
		return pizza;
    }
    
}
