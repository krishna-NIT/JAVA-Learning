package com.revision;

public class Holden extends Car{
    public Holden(int cylinders, String name){
        super(cylinders,name);
    }

    @Override
    public String startEngine(){
        return "Holden the car's engine is starting";
    }
    @Override
    public String accelerate(){
        return "Holden the car is accelerating";
    }
    @Override
    public String brake(){
        return "Holden  the car is braking";
    }
}
