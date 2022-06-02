package com.emard.restclient.designpattern.singletonpattern.chocolate;

public class ChocolateController {
    public static void main(String[] args) {
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        boiler.fill();
        boiler.boil();
        boiler.drain();
        ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
    }
}
