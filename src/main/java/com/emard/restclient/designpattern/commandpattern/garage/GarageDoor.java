package com.emard.restclient.designpattern.commandpattern.garage;

//receiver: c'est surtout savoir comment l'action sera executée
public class GarageDoor {
    String location;

    public GarageDoor(String location) {
        this.location = location;
    }

    public void up() {
        System.out.println(location + " is Up");
    }

    public void down() {
        System.out.println(location + " is Down");
    }

    public void stop() {
        System.out.println(location + " is Stopped");
    }

    public void lightOn() {
        System.out.println(location + " light is on");
    }

    public void lightOff() {
        System.out.println(location + " light is off");
    }
}
