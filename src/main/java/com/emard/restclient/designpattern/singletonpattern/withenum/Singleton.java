package com.emard.restclient.designpattern.singletonpattern.withenum;
/**
 * Plus optimal pour le les thread safe
 */
public enum Singleton {
    UNIQUE_INSTANCE;
    
    public String getDescription() {
		return "I'm a thread safe Singleton!";
	}
}
