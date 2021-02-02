package com.revision.array2;

import java.util.Scanner;

public class CheckArrayRotation {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter Length of array");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter all elements of Array");
        for (int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("Shifted by"+ rotvalue(arr));
    }
    public static int rotvalue(int[] arr){
        int rot=1;
        for (int i=0;i<arr.length-1;i++){
            if (arr[i]<arr[i+1]) {
                rot++;
            }else {
                return rot;
            }
            }

        if (rot==arr.length) {
            rot = 0;
        }
            return rot;

    }
}
