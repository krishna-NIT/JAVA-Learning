package com.revision;

public class Person extends SimpleCalculator {
    int f;
    int l;
    float div;

    public Person(){
        super("rajesh");
        System.out.println("subclass Constructor called");

    }
    public Person(String Name){
        super("mahalle");
        System.out.println("Sub class Paramatrized Constructor"+Name);
    }
    public void setF(int f) {
        this.f = f;
    }

    public void setL(int l) {
        this.l = l;
    }

    public void setDiv(int div) {
        this.div = div;
    }

    public float getDiv() {
        return div;
    }

    public int getF() {
        return f;
    }

    public int getL() {
        return l;
    }

    public float div(){
        div =getF()/getL();
        return div;
    }
}
