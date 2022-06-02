package com.emard.restclient.designpattern.observerpattern;

import com.emard.restclient.designpattern.observerpattern.observer.impl.CurrentConditionsDisplay;
import com.emard.restclient.designpattern.observerpattern.observer.impl.ForecastDisplay;
import com.emard.restclient.designpattern.observerpattern.subject.impl.WeatherData;
/**
 * Le pattern Observateur définit une relation entre objets de type un-à-plusieurs, de façon que,
lorsque un objet change d’état, tous ceux qui en dépendent en soient notifiés et soient mis à jour
automatiquement.
 * 
 * Nous avons un modèle (subject) qui maintient vos objets (observer) dans le savoir quand quelque chose qui les intéresse se produit
 * The Observer Pattern defines a one-to-many dependency between objects so that when
    one object changes state, all its dependents are notified and updated automatically
 * one to many : un subject qui notifie des observers (leur etat peuvent changer)
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);


        weatherData.setMeasurements(80f, 65f, 25.4f);
        weatherData.setMeasurements(82f, 70f, 29.2f);
        weatherData.setMeasurements(78f, 90f, 29.2f);

        
    }
}
