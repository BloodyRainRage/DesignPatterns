package com.baddragon.ObjectPool.Parking;

import com.baddragon.ObjectPool.Car.Car;

public class Parking {

    Car[] items;

    public Parking(int cars){
        items = new Car[cars];

        for (int i=0; i<cars; ++i){
            items[i] = new Car();
        }
    }

    public Car hireCar(){
        for (Car car: items) {
            if(!car.isHired()){
                car.setHired(true);
                return car;
            }
        }
        return null;
    }

    public void returnCar(Car car){
        car.setHired(false);
    }

}
