package com.lld.designpatterns.abstractfactory.product;

public class Bike implements Vehicle {

    @Override
    public void drive() {
        System.out.println("Driving Bike 🏍️");
    }
}
