package com.revision;

public class Ford extends Car {
    public Ford(int cylinders, String name){
        super(cylinders,name);
    }

    @Override
    public String startEngine(){
        return "Ford the car's engine is starting";
    }
    @Override
    public String accelerate(){
        return "Ford the car is accelerating";
    }
    @Override
    public String brake(){
        return "Ford  the car is braking";
    }
}
