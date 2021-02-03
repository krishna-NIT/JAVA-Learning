package com.revision.recursion;

import java.util.Scanner;

public class SumOfArrray {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int j = 0;j<n;j++){
            arr[j]=scan.nextInt();
        }
        System.out.println(sum(arr));
    }
    static int sum =0;
    static int i =0;
    public static int sum(int input[]) {
        sum+=input[i];
        i++;
        if (i<input.length){
            sum(input);
        }
        return sum;
    }
}
