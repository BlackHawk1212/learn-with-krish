package com.virtusa.designpatterns.example.factory;

public class CarFactory {

    public static Car buildCar(CarType model) {
        Car car = null;

        switch (model) {
            case HATCHBACK:
                car = new HatchbackCar();
                break;

            case SEDAN:
                car = new SedanCar();
                break;

            case LUXURY:
                car = new LuxuryCar();
                break;

            case SPORTS:
                car = new SportsCar();
                break;

            default:
                break;
        }
        return car;
    }

}
