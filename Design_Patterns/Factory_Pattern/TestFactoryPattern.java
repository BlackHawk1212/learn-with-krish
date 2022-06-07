package com.virtusa.designpatterns.example.factory;

public class TestFactoryPattern {

    public static void main(String[] args){

        System.out.println(CarFactory.buildCar(CarType.HATCHBACK));
        System.out.println(CarFactory.buildCar(CarType.SEDAN));
        System.out.println(CarFactory.buildCar(CarType.LUXURY));
        System.out.println(CarFactory.buildCar(CarType.SPORTS));

    }

}
