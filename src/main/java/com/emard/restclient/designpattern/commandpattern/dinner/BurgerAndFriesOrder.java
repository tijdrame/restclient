package com.emard.restclient.designpattern.commandpattern.dinner;
//command concrete: operation avec parametre à transmettre au receiver (ici cook)
public class BurgerAndFriesOrder implements Order {

    Cook cook;
	public BurgerAndFriesOrder(Cook cook) {
		this.cook = cook;
	}

    // execute
    @Override
    public void orderUp() {
        cook.makeBurger();
		cook.makeFries();
    }
    
}
