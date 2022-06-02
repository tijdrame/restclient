package com.emard.restclient.designpattern.strategypattern.impl;

import com.emard.restclient.designpattern.strategypattern.interf.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior{

    public void fly(){
        System.out.println("I'm flying with a rocket!");
    }
}
