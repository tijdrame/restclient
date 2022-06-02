package com.emard.restclient.designpattern.commandpattern.garage;

//receiver: c'est surtout savoir comment l'action sera executée
public class Light {
    String location = "";

	public Light(String location) {
		this.location = location;
	}

	public void on() {
		System.out.println(location + " light is on");
	}

	public void off() {
		System.out.println(location + " light is off");
	}
}
