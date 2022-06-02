package com.emard.restclient.designpattern.compositepattern.menu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
// branche
public class Menu extends MenuComponent {
    
    List<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
	String name;
	String description;

    public Menu(String name, String description) {
		this.name = name;
		this.description = description;
	}
 
	public void add(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
	}
 
	public MenuComponent getChild(int i) {
		return (MenuComponent)menuComponents.get(i);
	}
 
	public String getName() {
		return name;
	}
 
	public String getDescription() {
		return description;
	}
 
	public void print() {
		System.out.print("\n" + getName());
		System.out.println(", " + getDescription());
		System.out.println("---------------------");

        /*for (MenuComponent menuComponent : menuComponents) {
            menuComponent.print();
        }*/
  
		Iterator<MenuComponent> iterator = menuComponents.iterator();
		while (iterator.hasNext()) {
			MenuComponent menuComponent = 
				(MenuComponent)iterator.next();
			menuComponent.print();
		}
	}
}
