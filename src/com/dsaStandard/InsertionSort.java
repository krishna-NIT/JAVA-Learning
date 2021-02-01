package com.dsaStandard;
import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter Length of array");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter all elements of Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        InsertSort(arr);
        System.out.println("sorted array is");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void InsertSort(int[] arr) {
        for (int i =0;i<arr.length;i++){
            for (int j=i;j>=0;j--) {
                    if (arr[j] > arr[j + 1]) {
                        swap(arr[j], arr[j + 1]);

                    }
                }
        }
    }

    public static void swap(int a,int b){
        int temp = a;
        a=b;
        b = temp;
    }
}