package com;

import java.util.LinkedList;

public class SnapshotArray {
    public SnapshotArray(int length) {
        int[] arr = new int[length];
    }

    public void set(int index, int val) {

    }

    public int snap() {

    }

    public int get(int index, int snap_id) {

    }

    public boolean isPerfectSquare(int num) {
        for (int i = 1;i<=num;i++){
            if (i*i == num){
                return true;
            }
        }
        return false;
    }
    public String reformat(String s) {
        LinkedList<Character> lsalpha = new LinkedList<Character>();
        LinkedList<Character> lssymbol = new LinkedList<Character>();

        for (int i = 0;i<s.length();i++){
            int ascii = (int) s.charAt(i);
            if (ascii>=97 && ascii<=122){
                lsalpha.add(s.charAt(i));
            }else {
                lssymbol.add(s.charAt(i));
            }
        }
        System.out.println(lsalpha);
        System.out.println(lssymbol);
        String ans = "";
        if ( lsalpha.size() == lssymbol.size()+1 || lssymbol.size() == lsalpha.size()+1 || lsalpha.size() == lssymbol.size()){
            int len = s.length();
            int j =0;
            for (int i = 0;i<len;i++){
                if (lsalpha.size()<lssymbol.size() && i == 0){
                    ans += lssymbol.getFirst();
                }
                if (j<=lsalpha.size() && j<=lssymbol.size()) {
                    System.out.println(j);
                    if (j<lsalpha.size()) {
                        ans += lsalpha.get(j);
                    }
                    if (j<lssymbol.size() && lsalpha.size()>=lssymbol.size()) {
                        ans += lssymbol.get(j);
                    }

                    if (j<lssymbol.size()-1 && lsalpha.size()<lssymbol.size()) {
                        ans += lssymbol.get(j+1);
                    }
                    j++;
                }
                if (lsalpha.size()>lssymbol.size() && i == len-1){
                    ans += lsalpha.getLast();
                }
            }
            if (lsalpha.size()<lssymbol.size()){
                ans = ans.substring(0,ans.length()-2);
            }
            return ans;
        }else {
            return ans;
        }
    }


        public int arrangeCoins(int n) {
    int count = 0;
    int i = 1;
    while (n>=i){
        n -= i;
        i++;
        count++;
    }
    return count;
    }


    public int longestMountain(int[] arr) {
        LinkedList<Integer> ls = new LinkedList<Integer>();
        int maxlen = 0;
        for (int i = 0;i<arr.length-2;i++){
            for (int j = i+2;j<arr.length;j++){
                int max = ;
            }
        }
        return maxlen;
    }
    public int maxind(int[] arr, int s, int e){
        for (int i = s;i<=e-2;i++){
            if (arr[i]<arr[i+1] && arr[i+1]>arr[i+2]){
                return i+1;
            }
        }

    }


    public boolean circularArrayLoop(int[] nums) {
        int temp = 0;
        LinkedList<Integer> ls = new LinkedList<Integer>();
        ls.add(0);
        for (int i = 0;i<nums.length;){
            if (nums[i] >0){
                i += nums[i];
                if (i >nums.length){
                    i=i%nums.length;
                }
                ls.add(i);
            }else {
                i-=nums[i];

            }
            if (ls.getLast() == 0 && temp == 1){
                return true;
            }
            temp =1;
        }
        return false;
    }
}
