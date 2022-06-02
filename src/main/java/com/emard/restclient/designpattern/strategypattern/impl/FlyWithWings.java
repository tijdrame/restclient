package com.emard.restclient.designpattern.strategypattern.impl;

import com.emard.restclient.designpattern.strategypattern.interf.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
    
}
