package com.dsaStandard;

import java.util.Scanner;

public class SelectionSort {
public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter Length of array");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter all elements of Array");
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

        int minindex=0;
        for (int i=0;i<arr.length-1;i++){
        int min = Integer.MAX_VALUE;
        for (int j = i;j<arr.length;j++){
        if (min>arr[j]){
        min = arr[j];
        minindex=j;
        }
        }
        //Swap
        arr[minindex]=arr[i];
        arr[i]=min;

        }
        }
        }