package com.emard.restclient.designpattern.compose.duck;
/**
 * cette classe (pattern adapteur) permet de transformer une oie en canard.
 * Toujours implementer l'interface cible (ici Cancaneur).
 */
public class AdaptateurDOie implements Cancaneur {

    Observable observable;
    Oie oie;
    public AdaptateurDOie(Oie oie){
        this.oie = oie;
        observable = new Observable(this);
    }

    @Override
    public void cancaner() {
        oie.cacarder();
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
