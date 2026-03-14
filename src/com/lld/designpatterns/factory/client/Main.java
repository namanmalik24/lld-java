package com.lld.designpatterns.factory.client;

import com.lld.designpatterns.factory.factory.VehicleFactory;
import com.lld.designpatterns.factory.product.*;

public class Main {

    public static void main(String[] args) {

        VehicleFactory.registerVehicle("CAR", Car::new);
        VehicleFactory.registerVehicle("BIKE", Bike::new);

        Vehicle car = VehicleFactory.createVehicle("CAR");
        car.drive();

        Vehicle bike = VehicleFactory.createVehicle("BIKE");
        bike.drive();

    }

}