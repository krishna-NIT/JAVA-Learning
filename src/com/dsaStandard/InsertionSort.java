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

    // DOn't Prefer this Insertion Sort
    public static void InsertSort(int[] arr) {
        for (int i =0;i<arr.length;i++){
            for (int j=i;j>=0;j--) {
                    if (arr[j] > arr[j + 1]) {
                        swap(arr[j], arr[j + 1]);
                    }
                }
        }
    }

    // Prefer this Insertion SOrt
    public static void InsertionSort1(int[] arr){
        if (arr.length <=1){
            return;
        }
        for (int i = 1 ;i <arr.length;i++){
            int current = arr[i];
            int j = i-1;
            while (arr[j] > arr[i] && j>=0){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
    }

    public static void swap(int a,int b){
        int temp = a;
        a=b;
        b = temp;
    }
}