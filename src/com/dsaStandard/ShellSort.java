package com.dsaStandard;

import java.util.Scanner;

public class ShellSort {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        int[] res = shellsort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(res[i]+" ");
        }
    }
    public static void swap(int a,int b){
        int tem = a;
        a=b;
        b = tem;
    }

    //M1
// Lamba hai Solution tumhara
    public static int[] shellsort(int[] arr){
        for (int gap = (arr.length/2);gap>=1;gap/=2) {
            for (int i = 0; (i + gap) < arr.length; i++) {
                if (arr[i] > arr[i + gap]) {
                    int temp = arr[i];
                    arr[i]=arr[i+gap];
                    arr[i+gap]=temp;
                    if ((i-gap)>=0) {
                        if (arr[i - gap] > arr[i] && (i - gap) >= 0) {
                            swap(arr[i - gap], arr[i]);
                            int temp1 = arr[i-gap];
                            arr[i-gap]=arr[i];
                            arr[i]=temp;
                        }
                    }
                }
            }
        }
    return arr;
    }



}
