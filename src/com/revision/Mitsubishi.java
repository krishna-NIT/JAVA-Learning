package com.revision;

public class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name){
        super(cylinders,name);
    }

    @Override
    public String startEngine(){
        return "Mitsubhishi the car's engine is starting";
    }
    @Override
    public String accelerate(){
        return "Mitsubhishi the car is accelerating";
    }
    @Override
    public String brake(){
        return "Mitsubhishi  the car is braking";
    }
}
