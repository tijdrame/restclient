package com.emard.restclient.designpattern.compose.duck;

public class Colvert implements Cancaneur{

    Observable observable;
    public Colvert(){
        observable = new Observable(this);
    }
    @Override
    public void cancaner() {
        System.out.println("Coincoin");
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
