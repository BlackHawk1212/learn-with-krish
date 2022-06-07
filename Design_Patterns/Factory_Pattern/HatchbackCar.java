package com.virtusa.designpatterns.example.factory;

public class HatchbackCar extends Car{

    HatchbackCar() {
        super(CarType.HATCHBACK);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building a Hatchback Car.");
    }

}
