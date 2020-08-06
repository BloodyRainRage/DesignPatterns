package com.baddragon;

import com.baddragon.ObjectPool.Car.Car;
import com.baddragon.ObjectPool.Parking.Parking;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //we have a pool of objects which has a concrete amount of items
        //for example: if we want to hire a car on parking, we are checking all cars
        //until we find non-hired car, then we reserve it for ourselves
        //that's the principe of Object Pool
        //check Car and Parking

        Parking parking = new Parking(3);
        List<Car> cars = new ArrayList<>();
        Car car;
        while ((car = parking.hireCar()) != null){
            cars.add(car);
            System.out.println("One car hired");
        }

        System.out.println("No more available cars");

    }
}
