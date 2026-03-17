package com.lld.designpatterns.abstractfactory.product;

public class Car implements Vehicle {

    @Override
    public void drive() {
        System.out.println("Driving Car 🚗");
    }
}
