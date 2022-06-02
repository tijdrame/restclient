package com.emard.restclient.designpattern.commandpattern.remote;

public class CeilingFanOnCommand implements Command {
	CeilingFan ceilingFan;

	public CeilingFanOnCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
    @Override
	public void execute() {
		ceilingFan.high();
	}

    @Override
    public void undo() {
    }
}