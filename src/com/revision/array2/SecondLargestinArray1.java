package com.revision.array2;

import java.util.Scanner;

public class SecondLargestinArray1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter Length of array");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter all elements of Array");
        for (int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("Second Largest is "+seclar(arr));
    }
    public static int seclar(int[] arr){
        int lar = Integer.MIN_VALUE;
        int lar2 = lar;
    for (int i=0;i<arr.length;i++){
        if (arr[i]>lar){
            lar = arr[i];
        }
    }
    for (int i=0;i<arr.length;i++){
        if (arr[i]>lar2 && arr[i]<lar){
            lar2=arr[i];
        }
    }
    return lar2;
    }
}
