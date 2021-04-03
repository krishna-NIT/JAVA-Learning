package com.billsburgers;

import java.util.Scanner;

/*
Here for Finding sum of Taylor Series of e^x, we Create 2 functions, one for
calculating factorial [factorial(x)] with help of recursion to make good time & Space Complexity
and other [ex(x,n)] for calculating value of Taylor Series.
 */
public class Movenegtooneside {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0;i<arr.length;i++){
            arr[i] = scan.nextInt();
        }
        //movenegto1side(arr);
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
/*
    Test Cases:
        Input: 7 8
        Output: 12

        Input: 3 25
        Output: 5

        Time Complexity: O(n)
        Space Complexity: O(1)
 */
