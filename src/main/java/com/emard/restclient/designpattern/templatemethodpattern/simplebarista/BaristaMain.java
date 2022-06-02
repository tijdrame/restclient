package com.emard.restclient.designpattern.templatemethodpattern.simplebarista;

/**
 * The Template Method defines the steps of an algorithm and allows
subclasses to provide the implementation for one or more steps.
 */
public class BaristaMain {
    public static void main(String[] args) {
		Tea tea = new Tea();
		Coffee coffee = new Coffee();
		System.out.println("Making tea...");
		tea.prepareRecipe();
		System.out.println("Making coffee...");
		coffee.prepareRecipe();
	}
}
