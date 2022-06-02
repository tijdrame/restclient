package com.emard.restclient.designpattern.strategypattern.impl;

import com.emard.restclient.designpattern.strategypattern.interf.QuackBehavior;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("<<Silence>>");        
    }
    
}
