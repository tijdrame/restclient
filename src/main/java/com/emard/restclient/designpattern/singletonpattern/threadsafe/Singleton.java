package com.emard.restclient.designpattern.singletonpattern.threadsafe;

public class Singleton {
    private static Singleton uniqueInstance;
    // private static Singleton uniqueInstance = new Singleton(); et remove synchronized dans getInstance 
    // pour pb de performance

    // other useful instance variables here

    private Singleton(){}

    public static synchronized Singleton getInstance(){
        if(uniqueInstance == null) uniqueInstance = new Singleton();
        return uniqueInstance;
    }

    // other useful methods here
	public String getDescription() {
		return "I'm a thread safe Singleton!";
	}
}
