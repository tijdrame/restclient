package com.emard.restclient.designpattern.compose.duck;

public interface Cancaneur extends CouacObservable{ // ajout extends CouacObservable pour les observables
    public void cancaner() ;
}
