package com.revision.recursion;

import java.util.Scanner;
public class checkNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int j = 0;j<n;j++){
            arr[j]=scan.nextInt();
        }
        int y= scan.nextInt();
        System.out.println(checkno(arr,y));
    }

    static int i =-1;
    public static boolean checkno(int input[],int x){
        i++;
        if (input[i]==x){
            return true;
        }else if (i<input.length-1){
            return checkno(input,x);
        }else {
            return false;
        }

    }
    }

