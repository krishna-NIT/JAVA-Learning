package com.revision.recursion;
import java.util.Scanner;

public class NoOfDigits {
    public static int count(int n){
        if (n==0){
            return 0;
        }
        return count(n/10)+1;


    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(count(n));
    }

}
