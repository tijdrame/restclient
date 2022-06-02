package com.emard.restclient.designpattern.factorypattern.pizza;

import com.emard.restclient.designpattern.factorypattern.pizza.interf.Pizza;
import com.emard.restclient.designpattern.factorypattern.pizza.store.ChicagoPizzaStore;
import com.emard.restclient.designpattern.factorypattern.pizza.store.NYPizzaStore;
import com.emard.restclient.designpattern.factorypattern.pizza.store.PizzaStore;
/**
 * The Factory Method Pattern defines an interface for creating an object, but lets subclasses decide which
 * class to instantiate. Factory Method lets a class defer instantiation to subclasses.
 * 
 * On a une classe abstraite de création. elle definit la methode de creation des products (ex: pizza).
 * On a des classes qui implementent cette classe abstraite et redéfint leur méthode de création (ex: ney york cheese pizza, chicago royal pizza..).
 * les products crees Heritent du product principal (ex : CHicagocheese extends Pizza)
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
