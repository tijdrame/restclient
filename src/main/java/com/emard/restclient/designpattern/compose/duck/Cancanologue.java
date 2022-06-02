package com.emard.restclient.designpattern.compose.duck;

public class Cancanologue implements Observateur {

    @Override
    public void actualiser(CouacObservable canard) {
        System.out.println("Cancanologue: "+canard + " vient de cancaner.");
    }
    
    public String toString() {
        return this.getClass().getName();
    }
}
