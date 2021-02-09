package com.billsburgers;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class RailwayRoute {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Enter No. of Cities in Route");
        int n = scan.nextInt();
        LinkedList<String> newls = new LinkedList<String>();
        newls= create(n);
        for (int i =0;i<5;i++) {
            inp(newls);
        }
    }
    public static void inp(LinkedList<String> newls){
        System.out.println("Select from Below Options");
        System.out.println("1.  To know Current City");
        System.out.println("2.  To Know Next City");
        System.out.println("3.  To know Previous City");
        System.out.println("4.  To Print Complete Route of Cities");
        int inp = scan.nextInt();
        switch (inp){
            case 2:
                nx(newls);
                break;
            case 3:
                prev(newls);
                break;
            case 1:
                pri(newls);
                break;
        }
    }
    public static void pri(LinkedList<String> newls){
        ListIterator<String> slIterator = newls.listIterator();
        if (slIterator.hasNext()){
            System.out.print(slIterator.next()+" ");
        }
    }
    public static void prev(LinkedList<String> newsls){
        ListIterator<String> slIterator = newsls.listIterator();
        if (slIterator.hasPrevious()){
            System.out.println(slIterator.previous());
        }
    }

    public static void nx(LinkedList<String> newsls){
        ListIterator<String> slIterator = newsls.listIterator();
        if (slIterator.hasNext()){
            System.out.println(slIterator.next());
        }
    }
    public static LinkedList<String> create(int n){
        LinkedList<String> citname = new LinkedList<String>();
        ListIterator<String> slIterator = citname.listIterator();
        while (slIterator.hasNext()){
            citname.add(scan.next());
            slIterator.add(scan.next());
        }
        return citname;
    }
}
