package com.revision.array2;

import java.util.Scanner;

public class Sort012 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter Length of array");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter all elements of Array");
        for (int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        sort01(arr);
        System.out.println("Sorted 0 1 2 is");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void sort01(int[] arr){
        int c0 =0;
        int c1 =0;
        int c2 =0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==0){
                c0++;
            }else if (arr[i]==1){
                c1++;
            }else if (arr[i]==2){
                c2++;
            }
        }
        for (int i=0;i<c0;i++){
            arr[i]=0;
        }
        for (int i =c0;i<(c0+c1);i++){
            arr[i]=1;
        }
        for (int i =(c1+c0);i<(c0+c1+c2);i++){
            arr[i]=2;
        }
    }
}
