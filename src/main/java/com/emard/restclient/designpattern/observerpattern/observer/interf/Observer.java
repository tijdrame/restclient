package com.emard.restclient.designpattern.observerpattern.observer.interf;

public interface Observer {
    //public void update(Float temp, Float humidity, Float pressure);
    public void update(); // sans argument est plus générique, permet de changer l'etat des observers
}
