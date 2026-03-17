package com.lld.designpatterns.abstractfactory.factory;

import com.lld.designpatterns.abstractfactory.product.*;

public class BikeFactory implements VehicleFactory {

    @Override
    public Vehicle createVehicle() {
        return new Bike();
    }

    @Override
    public Engine createEngine() {
        return new ElectricEngine();
    }
}