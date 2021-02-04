package com.revision.recursion;
import java.util.Scanner;

public class removeX {
    public static String rem(String inp, char x){
        if (inp.length()==0){
            return inp;
        }
        String small = rem(inp.substring(1),x);
        if (small.charAt(0)==x){
            return small;
        }else {
            return inp.charAt(0)+small;
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String b= scan.nextLine();
        System.out.println(rem(b,'x'));
    }
}
