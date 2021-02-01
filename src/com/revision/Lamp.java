package com.revision;

public class Lamp {
    private String style;
    private boolean battery;
    private int globRating;

    public Lamp(String style, boolean battery, int globRating){
        this.style=style;
        this.battery=battery;
        this.globRating=globRating;
    }
    public static void turnOn(){
        System.out.println("the lamp is being turned on");
    }

    public String getStyle() {
        return style;
    }
    public boolean isBattery(){
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }
    public static void main(){

    }
}
