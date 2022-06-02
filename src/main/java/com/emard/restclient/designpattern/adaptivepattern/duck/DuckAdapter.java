package com.emard.restclient.designpattern.adaptivepattern.duck;

import java.util.Random;

// Duck to Turkey
public class DuckAdapter implements Turkey {

    Duck duck;
    Random rand;

    public DuckAdapter (Duck duck){
        this.duck = duck;
        rand = new Random();
    }
    @Override
    public void gobble() {
        duck.quack();        
    }

    @Override
    public void fly() {
        if (rand.nextInt(5)  == 0) {
            duck.fly();
       }   
    }
    
}