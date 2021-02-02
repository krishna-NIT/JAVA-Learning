package com.revision.array2;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter Length of array");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter all elements of Array");
        for (int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("By how much you want to shift it to left side :");
        int s = scan.nextInt();
        rotarray(arr,s);
        System.out.println("Rotated array is");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void rotarray(int[] arr, int x){
        for (int i = 1;i<=x;i++){
            comefrontbyval1(arr);
        }
    }
    public static void comefrontbyval1(int[] arr){
        int temp = arr[0];
        for (int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;
    }
}
