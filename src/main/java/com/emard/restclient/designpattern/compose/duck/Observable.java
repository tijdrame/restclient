package com.emard.restclient.designpattern.compose.duck;

import java.util.ArrayList;
import java.util.Iterator;

public class Observable implements CouacObservable {

    ArrayList<Observateur> observateurs = new ArrayList<>();
    CouacObservable canard;

    public Observable(CouacObservable canard) {
        this.canard = canard;
    }

    @Override
    public void enregistrerObservateur(Observateur observateur) {
        observateurs.add(observateur);
    }

    @Override
    public void notifierObservateurs() {
        Iterator<Observateur> iterateur = observateurs.iterator();
        while (iterateur.hasNext()) {
            Observateur observateur =  iterateur.next();
            observateur.actualiser(canard);
        }
    }

}
