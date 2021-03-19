/*
First we Will Sort Array with O( N logN ) Time Complicity in Ascending Order so, we will apply Merge Sort First
then as per kth Min Element requested then we will print kth Min elemet as arr[k-1]
then as per kth Max Element requested then we will print kth Min elemet as arr[len-k]
where len is Length of Array and k is the Position of Element
 */
package com.billsburgers;
import java.util.Scanner;

public class kminmax {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Length of Array :");
        int len = scan.nextInt();
        int[] arr = new int[len];
        for (int i =0;i<len;i++){
            arr[i] = scan.nextInt();
        }
        sort(arr);
        System.out.println("Select Option : ");
        System.out.println("1. Minimum Element");
        System.out.println("2. Maximum Element");
        int select = scan.nextInt();
        if (select == 1){
            System.out.println("Enter k for Kth Minimum Element : ");
            int k = scan.nextInt();
            if (k-1<len){
                System.out.println(k+" Max Element is "+arr[k-1]);
            }
        }else if (select == 2){
            System.out.println("Enter k for Kth Maximum Element : ");
            int k = scan.nextInt();
            if (len-k<len && len-k>=0){
                System.out.println(k+" Max Element is "+arr[len-k]);
            }
        }else {
            System.out.println("Wrong Option Selected");
            System.out.println("Enter 1 or 2");
            System.out.println("1 For -> Minimum Element");
            System.out.println("2 For -> Maximum Element");
        }
    }
    // Sort in Ascending Order
    // O(NLogN)
    public static void sort(int[] arr){

    }
}
/*
    Test Cases:
        Input: 5 8 9 5 2 4
        Output: 9

        Input: 3 0 1 0
        Output: 1

        Time Complexity: O(N logN)
        Space Complexity: O(1)
 */

