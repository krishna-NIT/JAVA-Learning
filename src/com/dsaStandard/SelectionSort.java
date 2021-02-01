package com.dsaStandard;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter Length of sorted array");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter all elements of Sorted Array");
        for (int i=0;i< arr.length;i++){
            arr[i]=scan.nextInt();
        }
        SelecSort(arr);
        System.out.println("sorted array is");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void SelecSort(int[] arr){
        int minindex=-1;
        int min = Integer.MAX_VALUE;
        for (int i=0;i<arr.length-1;i++){
            for (int j=i;j<arr.length;j++){
                if (arr[j]<min){
                    min = arr[j];
                    minindex = j;
                }
            }
            System.out.println(min);
            int temp = arr[minindex];
            arr[minindex]=arr[i];
            arr[i] = temp;

            //arr[minindex]=arr[i];
            //arr[i]=min;

        }

    }
}
