package com.lld.designpatterns.factory.client;

import com.lld.designpatterns.factory.factory.VehicleFactory;
import com.lld.designpatterns.factory.product.Vehicle;

public class Main {

    public static void main(String[] args) {

        Vehicle v1 = VehicleFactory.createVehicle("CAR");
        v1.drive();

        Vehicle v2 = VehicleFactory.createVehicle("BIKE");
        v2.drive();

    }

}