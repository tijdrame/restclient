package com.emard.restclient.designpattern.commandpattern.dinner;
//client: cree un objet concrete commande et definit le receiver (pas vraiment besoin de cette classe)
public class Customer {
    Waitress waitress;
    Order order;

    public Customer(Waitress waitress) {
        this.waitress = waitress;
    }

    public void createOrder(Order order) {
        this.order = order;
    }

    public void hungry() {
        waitress.takeOrder(order);
    }
}
