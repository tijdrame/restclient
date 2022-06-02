package com.emard.restclient.designpattern.iteratorpattern.dinner;

import java.util.Iterator;

public interface Menu {
    // avant on uitilisait notre Iteraor et maintenant java.util.Iterator
    public Iterator<MenuItem> createIterator();
}
