package com.emard.restclient.designpattern.compose.duck;

/**
 * Un Observable doit posséder des méthodes permettant d’enregistrer les
 * observateurs et de leur notifier des changements.
 * Ici c juste pour compter le nb de cancan par canard
 * Tous les canards qui implémentent cet interface pourront être observer
 */
public interface CouacObservable {
    public void enregistrerObservateur(Observateur observateur);

    public void notifierObservateurs();
}
