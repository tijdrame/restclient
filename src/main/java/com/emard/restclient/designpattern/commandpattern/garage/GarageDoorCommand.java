package com.emard.restclient.designpattern.commandpattern.garage;

//command concrete: operation avec parametre à transmettre au receiver (ici GarageDoor)
public class GarageDoorCommand implements Command {
    GarageDoor door;
    public GarageDoorCommand(GarageDoor door){
        this.door = door;
    }
    @Override
    public void execute() {
        door.up();
    }
    
}
