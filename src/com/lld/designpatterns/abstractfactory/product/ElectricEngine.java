package com.lld.designpatterns.abstractfactory.product;

public class ElectricEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Starting Electric Engine ⚡");
    }
}