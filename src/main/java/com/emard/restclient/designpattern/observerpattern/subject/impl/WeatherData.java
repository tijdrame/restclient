package com.emard.restclient.designpattern.observerpattern.subject.impl;

import java.util.ArrayList;
import java.util.List;

import com.emard.restclient.designpattern.observerpattern.observer.interf.Observer;
import com.emard.restclient.designpattern.observerpattern.subject.interf.Subject;

import lombok.Getter;

@Getter
public class WeatherData implements Subject {

    private List<Observer> observers;
    private Float temperature;
    private Float humidity;
    private Float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            //observer.update(temperature, humidity, pressure);
            observer.update();
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

}
