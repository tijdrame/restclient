package com.emard.restclient.designpattern.commandpattern.dinner;

/**
 * The Command Pattern encapsulates a request as an object, thereby letting you
 * parameterize other objects with different requests, queue or log requests,
 * and support undoable operations.
 * 
 * When you need to decouple an object making requests from the objects 
that know how to perform the requests, use the Command Pattern
 * 
 */
//client: cree un objet concrete commande et definit le receiver
public class DinerMain {
    public static void main(String[] args) {
        Cook cook = new Cook();
        Waitress waitress = new Waitress();
        Customer customer = new Customer(waitress);
        //waitress.takeOrder(new BurgerAndFriesOrder(cook));
        customer.createOrder(new BurgerAndFriesOrder(cook));
        customer.hungry();
    }
}
