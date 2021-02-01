package com.billsburgers;

public class Hamburger {
    String name;
    String meat;
    String breadRollType;
    double price;

    String addition1Name;
    double addition1Price;

    String addition2Name;
    double addition2Price;

    String addition3Name;
    double addition3Price;

    String addition4Name;
    double addition4Price;

    public void Hamburger(String name,String meat, String breadRollType, double price){
        this.breadRollType=breadRollType;
        this.meat=meat;
        this.name=name;
        this.price=price;
    }

    public void addHamburgerAddition1(String name,double price){
        this.addition1Price = price;
        this.addition1Name = name;
    }
    public void addHamburgerAddition2(String name,double price){
        this.addition2Price = price;
        this.addition2Name = name;
    }
    public void addHamburgerAddition3(String name,double price){
        this.addition3Price = price;
        this.addition3Name = name;
    }
    public void addHamburgerAddition4(String name,double price){
        this.addition4Price = price;
        this.addition4Name = name;
    }


}
