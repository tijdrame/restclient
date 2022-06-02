package com.emard.restclient.designpattern.strategypattern.impl;

import com.emard.restclient.designpattern.strategypattern.interf.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can't fly!!");
    }
    
}
