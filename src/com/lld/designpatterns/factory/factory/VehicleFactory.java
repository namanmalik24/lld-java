package com.lld.designpatterns.factory.factory;

import com.lld.designpatterns.factory.product.*;

public class VehicleFactory {

    public static Vehicle createVehicle(String type) {

        if (type.equalsIgnoreCase("CAR")) {
            return new Car();
        }

        if (type.equalsIgnoreCase("BIKE")) {
            return new Bike();
        }

        throw new IllegalArgumentException("Unknown vehicle type");
    }

}