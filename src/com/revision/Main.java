package com.revision;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        int f =scan.nextInt();
        for (int i=0;i< arr.length;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println(binarySearch(arr,f));


    }

    public static int binarySearch(int[] arr, int x) {
        int s =0;
        int e =arr.length-1;
        int mid = 0;
        while (s<=e){
            mid = (s+e)/2;
            if (arr[mid]>x){
                e=mid-1;
            }
            if (arr[mid]<x){
                s=mid+1;
            }
            if (arr[mid]==x){
                return mid;
            }
        }
        return -1;
    }
}

