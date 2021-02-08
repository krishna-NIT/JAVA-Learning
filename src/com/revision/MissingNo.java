package com.revision;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class MissingNo {
    static int[] missingNumbers(int[] arr, int[] brr) {
        LinkedList<Integer> lfina = new LinkedList<Integer>();
        for (int i =0;i<brr.length;i++){
            int count = 0;
            int k =0;
            for (int j =0;j<arr.length;j++){
                if (brr[i]!=arr[j]){
                    count++;
                    arr[j]=-1;
                }
            }
            if (count==arr.length){
               lfina.add(brr[i]);
            }
        }

        System.out.println(lfina);
        int[] farr = new int[lfina.size()];
            for (int i = 0;i<lfina.size();i++){
                farr[i] = lfina.get(i);
            }
        return farr;
    }
    public static void main(String[] args){
//        int[] arr = {203,204,205,206,207,208,203,204,205,206};
//        int[] brr = {203,204,204,205,206,207,205,208,203,206,205,206,204};
//        int[] result = missingNumbers(arr,brr);
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
        Map<String,Integer> phonels = new HashMap<String, Integer>();
            for(int i = 0; i < n; i++){
                String name = in.next();
                int phone = in.nextInt();
                // Write code here
                phonels.put(name,phone);
            }
            int i = phonels.size();
            while (i>0){
                String s = in.next();
                // Write code here
                if (phonels.get(s)!=null) {
                    System.out.println(s + "=" + phonels.get(s));
                }else {
                    System.out.println("Not found");
                }
                i--;
            }
            in.close();
    }
}
