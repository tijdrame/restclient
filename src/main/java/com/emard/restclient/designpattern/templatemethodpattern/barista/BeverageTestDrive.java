package com.emard.restclient.designpattern.templatemethodpattern.barista;

import com.emard.restclient.designpattern.templatemethodpattern.barista.withhook.CoffeeWithHook;
import com.emard.restclient.designpattern.templatemethodpattern.barista.withhook.TeaWithHook;

public class BeverageTestDrive {
    public static void main(String[] args) {
        Tea tea = new Tea();
		Coffee coffee = new Coffee();
 
		System.out.println("\nMaking tea...");
		tea.prepareRecipe();
 
		System.out.println("\nMaking coffee...");
		coffee.prepareRecipe();

        TeaWithHook teaHook = new TeaWithHook();
		CoffeeWithHook coffeeHook = new CoffeeWithHook();
 
		System.out.println("\nMaking tea...");
		teaHook.prepareRecipe();
 
		System.out.println("\nMaking coffee...");
		coffeeHook.prepareRecipe();
    }
}
