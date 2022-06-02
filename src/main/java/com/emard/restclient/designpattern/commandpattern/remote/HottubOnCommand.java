package com.emard.restclient.designpattern.commandpattern.remote;

public class HottubOnCommand implements Command {
	Hottub hottub;

	public HottubOnCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	public void execute() {
		hottub.on();
		hottub.heat();
		hottub.bubblesOn();
	}

    @Override
    public void undo() {
        // TODO Auto-generated method stub
        
    }
}