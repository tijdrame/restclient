package com.emard.restclient.designpattern.observerpattern.observer.impl;

import com.emard.restclient.designpattern.observerpattern.interf.DisplayElement;
import com.emard.restclient.designpattern.observerpattern.observer.interf.Observer;
import com.emard.restclient.designpattern.observerpattern.subject.impl.WeatherData;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    //public void update(Float temp, Float humidity, Float pressure) {
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }

    @Override
    public void display() {
        log.info("Current Conditions: [{}] F degrees and [{}] humidity", temperature, humidity);
    }

}
