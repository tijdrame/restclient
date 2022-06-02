package com.emard.restclient.designpattern.strategypattern.impl;

import com.emard.restclient.designpattern.strategypattern.interf.Duck;
import com.emard.restclient.designpattern.strategypattern.interf.FlyBehavior;
import com.emard.restclient.designpattern.strategypattern.interf.QuackBehavior;

//import lombok.Data;

//@Data
public class MallardDuck extends Duck {

    public MallardDuck (){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }

    public QuackBehavior getQuackBehavior() {
        return this.quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public FlyBehavior getFlyBehavior() {
        return this.flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
    
}
