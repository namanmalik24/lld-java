package com.lld.designpatterns.abstractfactory.factory;

import com.lld.designpatterns.abstractfactory.product.*;

public class CarFactory implements VehicleFactory {

    @Override
    public Vehicle createVehicle() {
        return new Car();
    }

    @Override
    public Engine createEngine() {
        return new PetrolEngine();
    }
}