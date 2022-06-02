package com.emard.restclient.designpattern.commandpattern.dinner;
// invoker: demande à la commande d'executer la requete
public class Waitress {
    Order order;
    public Waitress() {}
    //setCommand
    public void takeOrder(Order order) {
        this.order = order;
        order.orderUp();
    }
}
