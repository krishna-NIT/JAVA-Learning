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
    public class Node{
        int data;
        Node next;
        public Node(int a){
            this.data=a;
            this.next=null;
        }
    }
    public class Linkls{
        Node head;
        public void insert(int d){
            Node temp = new Node(d);
            if (temp.next == null){
                head = temp;
            }else {
                Node n = head;
                while (n.next!=null){
                    n=n.next;
                }
                n.next=temp;
            }
        }
    public void show(){
        Node n = head;
        while (n.next!= null){
            System.out.println(n.data);
            n=n.next;
        }
        System.out.println(n.data);
    }
    }
}

