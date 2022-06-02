package com.emard.restclient.designpattern.commandpattern.dinner;

//receiver: c'est surtout savoir comment l'action sera executée
public class Cook {
    
    public Cook() {}

	
	public void makeBurger() {
		System.out.println("Making a burger");
	}

	public void makeFries() {
		System.out.println("Making fries");
	}
    
}
