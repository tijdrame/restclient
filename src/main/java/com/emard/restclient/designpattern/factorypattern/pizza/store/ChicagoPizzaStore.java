package com.emard.restclient.designpattern.factorypattern.pizza.store;

import com.emard.restclient.designpattern.factorypattern.pizza.impl.ChicagoStyleCheesePizza;
import com.emard.restclient.designpattern.factorypattern.pizza.impl.ChicagoStyleClamPizza;
import com.emard.restclient.designpattern.factorypattern.pizza.impl.ChicagoStylePepperoniPizza;
import com.emard.restclient.designpattern.factorypattern.pizza.impl.ChicagoStyleVeggiePizza;
import com.emard.restclient.designpattern.factorypattern.pizza.interf.Pizza;

public class ChicagoPizzaStore extends PizzaStore{

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;

		if (type.equals("cheese")) {
			pizza = new ChicagoStyleCheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new ChicagoStyleVeggiePizza();
		} else if (type.equals("clam")) {
			pizza = new ChicagoStyleClamPizza();
		} else if (type.equals("veggie")) {
			pizza = new ChicagoStylePepperoniPizza();
		}
		return pizza;
    }
    
}
