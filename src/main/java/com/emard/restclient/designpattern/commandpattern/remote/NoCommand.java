package com.emard.restclient.designpattern.commandpattern.remote;

public class NoCommand implements Command {
	public void execute() { }

    @Override
    public void undo() { }
}
