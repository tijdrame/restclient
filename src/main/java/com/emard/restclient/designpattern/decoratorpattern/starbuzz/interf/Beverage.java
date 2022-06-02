package com.emard.restclient.designpattern.decoratorpattern.starbuzz.interf;

import lombok.Getter;

@Getter
public abstract class Beverage { // we can use also interface instead of abstract class

    public enum Size {
        TALL, GRANDE, VENTI
    };

    Size size = Size.TALL;

    public String description = "Unknown Beverage";

    public abstract double cost();

    public Size getSize() {
        return this.size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

}
