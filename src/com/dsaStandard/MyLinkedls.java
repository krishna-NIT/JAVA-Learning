package com.dsaStandard;
// Node class bhi hai
public class MyLinkedls {
    Node head;
    public void insert(int d){
        Node temp1 = new Node(d);
        if (head == null){
            head = temp1;
        }else {
            Node n = head;
            while (n.next!=null){
                n=n.next;
            }
            n.next = temp1;
        }
    }
    public void show(){
        Node n = head;
        while (n.next!=null){
            System.out.print(n.data+" ");
            n=n.next;
        }
        System.out.println(n.data);
        System.out.println();
    }


    public static void main(String[] args){
        MyLinkedls mylist1 = new MyLinkedls();
        mylist1.insert(5);
        mylist1.insert(27);
        mylist1.insert(82);
        mylist1.show();
    }
}
