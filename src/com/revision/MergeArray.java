package com.revision;
public class MergeArray {
   public static void main(String[] args){
       int[] arr = {1,2,3,4,5,0};
       reverseArray(arr);
       for (int i =0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
       }
   }
   public static void interchange(int[] arr,int index){
       for (int i=index;i<arr.length-1;i++){
            arr[i]=arr[i+1];
       }
       arr[arr.length-1]=0;
   }
   public static void reverseArray(int[] arr){
       if (arr.length%2==0){
           for (int i =0;i<arr.length/2;i++){
               int temp = arr[i];
               arr[i]=arr[arr.length-1-i];
               arr[arr.length-1-i]=temp;
           }
       }else {
           for (int i=0;i<(arr.length+1)/2;i++){
               int temp = arr[i];
               arr[i]=arr[arr.length-1-i];
               arr[arr.length-1-i]=temp;
           }

       }
   }
}
