package com.revision.recursion;

import java.util.Scanner;

public class LastIndex {
    static int count=0;
    static int maxindex=-1;
    public static int lastIndex(int input[], int x) {
        if (input[count]==x){
            maxindex=count;
        }
        count++;
        if (count<input.length){
            lastIndex(input,x);
        }
        return maxindex;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int j = 0;j<n;j++){
            arr[j]=scan.nextInt();
        }
        int y= scan.nextInt();
        int temp = lastIndex(arr,y);
        System.out.println(temp);
    }

}
