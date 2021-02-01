package com.dsaStandard;
import java.util.Scanner;
// INput shorted array biggest element to rignt
public class BinarySearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter Length of sorted array");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter all elements of Sorted Array");
        for (int i=0;i< arr.length;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("Enter no. whose index is to be find");
        int f =scan.nextInt();
        System.out.println("INdex of element "+f+" is ");
        System.out.println(binarySearch(arr,f));


    }
    public static int binarySearch(int[] arr, int x){
        int s =0;
        int e =arr.length-1;
        int mid = 0;
        while (s<=e){
            mid = (s+e)/2;
            if (arr[mid]<x){
                s=mid+1;
            }
            if (arr[mid]>x){
                e=mid-1;
            }
            if (arr[mid]==x){
                return mid;
            }
        }
        return -1;
    }
}

