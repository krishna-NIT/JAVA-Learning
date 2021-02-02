package com.revision.array2;

import java.util.Scanner;

public class pushZeroToEnd {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter Length of array");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter all elements of Array");
        for (int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("check");
        pushzerotoend(arr);
        System.out.println("sorted array is");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void pushzerotoend(int[] arr){
        int count=0;
        for (int i = 0;i<arr.length;i++){
            if (arr[i]==0 && count<arr.length){
                    interchange(arr,i);
                    i--;
                    count++;
            }

        }
    }
    public static void interchange(int[] arr,int x){
            for (int i=x;i<(arr.length-1);i++){
                arr[i]=arr[i+1];

            }
            arr[arr.length-1]=0;
    }
}
