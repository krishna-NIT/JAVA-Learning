package com.revision;

import java.util.LinkedList;

public class MissingNo {
    static int[] missingNumbers(int[] arr, int[] brr) {
        LinkedList<Integer> lfina = new LinkedList<Integer>();
        for (int i =0;i<brr.length;i++){
            int count = 0;
            int k =0;
            for (int j =0;j<arr.length;j++){
                if (brr[i]!=arr[j]){
                    count++;
                }
            }
            if (count==arr.length){
               lfina.add(brr[i]);
            }
        }

        System.out.println(lfina);
        int[] farr = new int[lfina.size()];
            for (int i = 0;i<lfina.size();i++){
                arr[i] = lfina.get(i);
            }
        System.out.println(farr);
        return farr;
    }
    public static void main(String[] args){
        int[] arr = {7,2,5,3,5,3};
        int[] brr = {7,2,5,4,6,3,5,3};
        System.out.println(missingNumbers(arr,brr));
    }
}
