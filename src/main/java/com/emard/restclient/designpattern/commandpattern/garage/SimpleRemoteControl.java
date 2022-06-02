package com.emard.restclient.designpattern.commandpattern.garage;

//Invoker: demande à la commande d'executer la requete
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
