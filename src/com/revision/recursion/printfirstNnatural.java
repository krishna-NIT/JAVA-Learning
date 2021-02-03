package com.revision.recursion;

import java.util.Scanner;

public class printfirstNnatural {
    static int i = 1;
    public static void print(int n){
        if (n>0) {
            if (n == 1) {
                System.out.print(i);
                return;
            }
            System.out.print(i + " ");
            i++;
            print(n - 1);
        }else {
            System.out.println(-1);
        }
    }static int y=1;
    public static int pow(int x, int n){
        if (n>1){
            return 1;
        }
        x=x*pow(x,n-1);
        return x;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        pow(9,n);
    }

}
