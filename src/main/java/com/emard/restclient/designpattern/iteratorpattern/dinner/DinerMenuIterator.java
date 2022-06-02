package com.emard.restclient.designpattern.iteratorpattern.dinner;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {

	MenuItem[] items;
	int position = 0;

	public DinerMenuIterator(MenuItem[] items) {
		this.items = items;
	}

	@Override
	public MenuItem next() {
		/*
		 * MenuItem menuItem = items[position];
		 * position = position + 1;
		 * return menuItem;
		 */

		// or shorten to
		return items[position++];
	}

	@Override
	public boolean hasNext() {
		/*
		 * if (position >= items.length || items[position] == null) {
		 * return false;
		 * } else {
		 * return true;
		 * }
		 */

		// or shorten to
		return items.length > position;
	}

	public void remove() {
		throw new UnsupportedOperationException("You shouldn't be trying to remove menu items.");
	}

}
