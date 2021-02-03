package com.revision.recursion;

import java.util.Scanner;

public class firstIndex {
    static int count=0;
    static int firindex=-1;
    public static int firIndex(int input[], int x) {
        if (input[count]==x && count<input.length){
            firindex=count;
            return firindex;
        }else {
            count++;
            firIndex(input, x);
        }
        return firindex;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int j = 0;j<n;j++){
            arr[j]=scan.nextInt();
        }
        int y= scan.nextInt();
        int temp = firIndex(arr,y);
        System.out.println(temp);
    }
}
