package com.emard.restclient.designpattern.compose.duck;

/**
 * On va utilisé le pattern décorateur. Impléménté aussi la classe cible?
 */
public class CompteurDeCouacs implements Cancaneur {
    Observable observable;
    static int nombreDeCouacs;
    Cancaneur canard;
    public CompteurDeCouacs(Cancaneur canard){
        this.canard = canard;
        observable = new Observable(this);
    }
    @Override
    public void cancaner() {
        canard.cancaner();
        nombreDeCouacs++;
        notifierObservateurs();
    }
    
    public static int getCouacs() {
        return nombreDeCouacs;
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
