package com.emard.restclient.designpattern.adaptivepattern.iterenum;

import java.util.Enumeration;
import java.util.Iterator;

// Enumeration to Iteraor
public class EnumerationIterator implements Iterator<Object> {

    Enumeration<?> enumeration;
 
	public EnumerationIterator(Enumeration<?> enumeration) {
		this.enumeration = enumeration;
	}
    
    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
		throw new UnsupportedOperationException();
	}
    
}
