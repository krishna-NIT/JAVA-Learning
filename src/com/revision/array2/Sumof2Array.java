package com.revision.array2;
import java.util.Scanner;

public class Sumof2Array {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter Length of array1");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter all elements of Array1");
        for (int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }

        System.out.println("enter Length of array2");
        int n2 = scan.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter all elements of Array2");
        for (int i=0;i<arr2.length;i++){
            arr2[i]=scan.nextInt();
        }
        System.out.println("sum is"+sumof2(arr,arr2));

    }
    public static int sumof2(int[] arr1,int[] arr2){
    int num1=0;
    int num2=0;
    int c1=0;
    int c2=0;

    for (int i=arr1.length;i>0;i--){
        num1+=(arr1[c1]*Math.pow(10,i-1));
        c1++;
    }
        System.out.println(num1);

//    for (int i=0;i<arr2.length;i++){
//        System.out.print(arr2[i]+" ");
//    }

    for (int i=arr2.length;i>0;i--){
            num2+=(arr2[c2]*Math.pow(10,i-1));
            c2++;
    }
        System.out.println(num2);

    return (num1+num2);
    }
}
