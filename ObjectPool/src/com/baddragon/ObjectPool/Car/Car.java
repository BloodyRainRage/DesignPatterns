package com.baddragon.ObjectPool.Car;

public class Car {

    boolean hired;

    public Car(){
        hired = false;
    }

    public boolean isHired(){
        return hired;
    }

    public void setHired(boolean b){
        hired = b;
    }

}
