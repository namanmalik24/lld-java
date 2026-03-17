package com.lld.designpatterns.abstractfactory.client;

import com.lld.designpatterns.abstractfactory.factory.*;
import com.lld.designpatterns.abstractfactory.product.*;

public class Main {

    public static void main(String[] args) {

        // Choose factory
        VehicleFactory factory = new CarFactory();
        // VehicleFactory factory = new BikeFactory();

        Vehicle vehicle = factory.createVehicle();
        Engine engine = factory.createEngine();

        vehicle.drive();
        engine.start();

    }
}