package com.emard.restclient.designpattern.strategypattern;

import com.emard.restclient.designpattern.strategypattern.impl.FlyRocketPowered;
import com.emard.restclient.designpattern.strategypattern.impl.MallardDuck;
import com.emard.restclient.designpattern.strategypattern.impl.ModelDuck;
import com.emard.restclient.designpattern.strategypattern.interf.Duck;

/**
 * The Strategy Pattern defines a family of algorithms,
encapsulates each one, and makes them interchangeable.
Strategy lets the algorithm vary independently from
clients that use it.
Prefer has a instead of is a

Stratégie - définit une famille d’algorithmes, encapsule chacun d’eux et les rend interchangeables.
Stratégie permet à l’algorithme de varier indépendamment des clients qui l’utilisent
 */
public class MainApp {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        //mallard.setFlyBehavior(new FlyRocketPowered());
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
