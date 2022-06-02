package com.emard.restclient.designpattern.iteratorpattern.dinner;

import java.util.ArrayList;

public class ArrayListIterator implements Iterator{

    ArrayList<MenuItem> items;
	int position = 0;
    
    @Override
    public MenuItem next() {
        MenuItem item = items.get(position);
		position = position + 1;
		return item;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.size()) {
			return false;
		} else {
			return true;
		}
    }
    
}
