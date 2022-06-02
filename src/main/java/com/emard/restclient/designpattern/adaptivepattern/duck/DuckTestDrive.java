package com.emard.restclient.designpattern.adaptivepattern.duck;

/**
 * The Adapter Pattern converts the interface of a class into another interface
 * the clients expect. Adapter lets classes work together that couldn’t
 * otherwise because of incompatible interfaces.
 */
public class DuckTestDrive {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
