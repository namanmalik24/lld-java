package com.lld.designpatterns.abstractfactory.factory;

import com.lld.designpatterns.abstractfactory.product.Engine;
import com.lld.designpatterns.abstractfactory.product.Vehicle;

public interface VehicleFactory {

    Vehicle createVehicle();
    Engine createEngine();

}