package com.revision.recursion;

import java.util.Scanner;

public class printfirstNnatural {

    public static void print(int n){
        if(n == 0){
            return;
        }
        print(n - 1);
        System.out.print(n+" ");
    }



    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        print(n);
    }
    // Perfect Recursion Solution
    public static int pow(int x, int n){
        if (n==0){
            return 1;
        }
        return x*pow(x,n-1);
    }

}
