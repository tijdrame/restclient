package com.emard.restclient.designpattern.compose.duck;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Troupe implements Cancaneur {

    Observable observable;
    List<Cancaneur> cancaneurs = new ArrayList<>();
    public void add(Cancaneur cancaneur) {
        cancaneurs.add(cancaneur);
        observable = new Observable(this);
    }
    @Override
    public void cancaner() {
        Iterator<Cancaneur> iterator = cancaneurs.iterator();
        while (iterator.hasNext()) {
            Cancaneur cancaneur = iterator.next();
            cancaneur.cancaner();
            notifierObservateurs();
        }
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
