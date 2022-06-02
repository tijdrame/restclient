package com.emard.restclient.designpattern.templatemethodpattern.barista.withhook;

public abstract class CaffeineBeverageWithHook {
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    //c le hook: cette methode peut être modifier ou pas
    boolean customerWantsCondiments() {
        return true;
    }
}
