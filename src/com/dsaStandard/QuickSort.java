package com.dsaStandard;

public class QuickSort {
    public static void main(String[] args){
        int[] arr = {5,8,27,9,6,2,4};
        int[] b =  quicksort(arr,0,arr.length-1);
        System.out.println(b);
    }

    static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {


    }

    public static int[] quicksort(int[] arr,int s,int e){
        int c=1;
        for (int i=0;i<arr.length;i++){
            if (arr[0]>arr[i]){
                c++;
            }
        }
        swap(arr[0],arr[c]);
        if (s>=e){
            return arr;
        }
        quicksort(arr,s,c-1);
        quicksort(arr,c+1,e);
        return arr;
    }
    public static void swap(int a, int b){
        int temp =a;
        a=b;
        b=temp;
    }
}
