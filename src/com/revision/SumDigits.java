package com.revision;

import java.util.Scanner;

public class SumDigits {


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        boolean num2 = scan.hasNextInt();
      //  int a = getGreatestCommonDivisor(num1,num2);
       // System.out.println(a);
    }
    public static int getGreatestCommonDivisor(int first, int second){
        int gdc=-1;
        if (first<10 || second<10){
            return -1;
        }else {
            if (first>second) {
                for (int i = 1; i <=second; i++) {
                    if (first%i==0 && second%i ==0){
                        gdc = i;
                    }
                }
            }else {
                for (int i =1;i<=first;i++){
                    if (first%i==0 && second%i ==0){
                        gdc = i;
                    }
                }
            }
        return gdc;
        }
    }


}
