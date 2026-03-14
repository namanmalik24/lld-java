package com.lld.designpatterns.factory.factory;

import com.lld.designpatterns.factory.product.Vehicle;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class VehicleFactory {

    private static final Map<String, Supplier<Vehicle>> registry = new HashMap<>();

    public static void registerVehicle(String type, Supplier<Vehicle> creator) {
        registry.put(type.toUpperCase(), creator);
    }

    public static Vehicle createVehicle(String type) {

        Supplier<Vehicle> supplier = registry.get(type.toUpperCase());

        if (supplier == null) {
            throw new IllegalArgumentException("Vehicle type not supported");
        }

        return supplier.get();
    }

}