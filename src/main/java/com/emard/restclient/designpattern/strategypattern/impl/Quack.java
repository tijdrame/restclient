package com.emard.restclient.designpattern.strategypattern.impl;

import com.emard.restclient.designpattern.strategypattern.interf.QuackBehavior;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack");     
    }
    
}
