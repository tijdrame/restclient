package com.emard.restclient.designpattern.compose.duck;

public class Appelant implements Cancaneur {

    Observable observable;
    public Appelant(){
        observable = new Observable(this);
    }

    @Override
    public void cancaner() {
        System.out.println("Couincouin");
        notifierObservateurs();
    }

    @Override
    public void enregistrerObservateur(Observateur observateur) {
        observable.enregistrerObservateur(observateur);
    }

    @Override
    public void notifierObservateurs() {
        observable.notifierObservateurs();
    }
    
}