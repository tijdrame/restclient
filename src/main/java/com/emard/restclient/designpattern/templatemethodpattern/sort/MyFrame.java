package com.emard.restclient.designpattern.templatemethodpattern.sort;

import java.awt.*;
import javax.swing.*;

/**
 * The Template Method defines the steps of an algorithm and allows
subclasses to provide the implementation for one or more steps.
 */
public class MyFrame extends JFrame{
    private static final long serialVersionUID = 2L;

	public MyFrame(String title) {
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setSize(300,300);
		this.setVisible(true);
	}

	public void paint(Graphics graphics) {
		super.paint(graphics);
		String msg = "I rule!!";
		graphics.drawString(msg, 100, 100);
	}

	public static void main(String[] args) {
		MyFrame myFrame = new MyFrame("Head First Design Patterns");
	}
}
