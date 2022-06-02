package com.emard.restclient.designpattern.commandpattern.garage;

//command concrete: operation avec parametre à transmettre au receiver (ici Light)
public class LightOnCommand implements Command {
	Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.on();
	}

	public void undo() {
		light.off();
	}
}
