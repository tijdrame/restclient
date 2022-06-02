package com.emard.restclient.designpattern.compose.duck;

public class Mandarin implements Cancaneur{

    Observable observable;
    public Mandarin(){
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
