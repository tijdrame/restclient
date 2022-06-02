package com.emard.restclient.designpattern.observerpattern.observer.impl;

import com.emard.restclient.designpattern.observerpattern.interf.DisplayElement;
import com.emard.restclient.designpattern.observerpattern.observer.interf.Observer;
import com.emard.restclient.designpattern.observerpattern.subject.impl.WeatherData;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ForecastDisplay implements Observer, DisplayElement {

    private float currentPressure = 29.92f;
    private float lastPressure;
    private WeatherData weatherData;

    public ForecastDisplay (WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        log.info("Forecast: Improving weather on the way!");  
		if (currentPressure > lastPressure) {
			log.info("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			log.info("More of the same");
		} else if (currentPressure < lastPressure) {
			log.info("Watch out for cooler, rainy weather");
		}
    }

    @Override
    public void update() {
        lastPressure = currentPressure;
        currentPressure = weatherData.getPressure();
        display();
    }
    
}
