package com;

public class Node {
    int data;
    Node next;
    //Constructor
    Node(int data){
        this.data=data;
        this.next=null;
    }
    Node head;
    void add(int data){
        Node toAdd = new Node(data);
        Node temp = head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=toAdd;
    }

}
