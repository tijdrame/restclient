package com.emard.restclient.designpattern.commandpattern.garage;

/**
 * The Command Pattern encapsulates a request as an object, thereby letting you
 * parameterize other objects
 * with different requests, queue or log requests, and support undoable
 * operations.
 * 
 * When you need to decouple an object making requests from the objects 
that know how to perform the requests, use the Command Pattern
 */
//Client
public class Main {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light("");
        LightOnCommand lightOn = new LightOnCommand(light);

        GarageDoor door = new GarageDoor("Garage door");
        GarageDoorCommand garagOpen = new GarageDoorCommand(door);
        //garagOpen.execute();

        
        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(garagOpen);
        remote.buttonWasPressed();

        
    }
}
