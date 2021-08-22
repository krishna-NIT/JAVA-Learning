package com.revision;

public class LinkeeddList {
    public static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    Node head;

    public static LinkeeddList lsinsert(LinkeeddList ls, int val){
        Node newnode = new Node(val);
        if (ls.head == null){
            ls.head = newnode;
        }else {
            Node last = ls.head;

            while (last.next != null){
                last = last.next;
            }
            last.next = newnode;
        }
        return ls;
    }
}
