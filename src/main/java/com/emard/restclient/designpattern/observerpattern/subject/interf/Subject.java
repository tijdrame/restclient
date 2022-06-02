package com.emard.restclient.designpattern.observerpattern.subject.interf;

import com.emard.restclient.designpattern.observerpattern.observer.interf.Observer;

/**
 * github
 * https://github.com/bethrobson/Head-First-Design-Patterns
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();

}
