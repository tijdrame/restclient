package com.emard.restclient.designpattern.decoratorpattern.starbuzz;


import com.emard.restclient.designpattern.decoratorpattern.starbuzz.impl.DarkRoast;
import com.emard.restclient.designpattern.decoratorpattern.starbuzz.impl.Expresso;
import com.emard.restclient.designpattern.decoratorpattern.starbuzz.impl.HouseBlend;
import com.emard.restclient.designpattern.decoratorpattern.starbuzz.impl.Mocha;
import com.emard.restclient.designpattern.decoratorpattern.starbuzz.impl.Soy;
import com.emard.restclient.designpattern.decoratorpattern.starbuzz.impl.Whip;
import com.emard.restclient.designpattern.decoratorpattern.starbuzz.interf.Beverage;

import lombok.extern.slf4j.Slf4j;

/**
 * The Decorator Pattern attaches additional responsibilities to an object dynamically.
   Decorators provide a flexible alternative to subclassing for extending functionality.
   Abstract component - Abstract Decorator - Concrete Decorator
 */
@Slf4j
public class MainDecorator {
    public static void main(String[] args) {
        Beverage beverage = new Expresso();
        log.info("[{}] [${}]",beverage.getDescription(), beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        log.info("[{}] [${}]",beverage2.getDescription(), beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        log.info("[{}] [${}]",beverage3.getDescription(), beverage3.cost());

    }
}

