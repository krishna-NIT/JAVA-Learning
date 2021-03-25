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
                int max = i+j ;
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
    public int divide(int dividend, int divisor) {
    if (dividend == -2147483648 && divisor == -1){
        return 2147483647;
    }
    if (dividend == 0){
        return 0;
    }
        int temp = 0;
    if (dividend<0 && divisor>0){
        temp =1;
        dividend*=(-1);
    }
    if (dividend>0 && divisor<0){
        temp = 1;
        divisor*=(-1);
    }
    if (dividend<0 && divisor<0){
        dividend*=(-1);
        divisor*=(-1);
    }
    int ans = 0;
    if (divisor == 1){
        ans = dividend;
    }else {
        ans = dividend / divisor;
    }
        if (divisor == 1 && dividend == 1){
            ans = dividend;
        }
        if (temp == 1 && ans<0){
            return ans;
        }
    if (temp == 1){
        return ((-1)*ans);
    }else {
        return ans;
    }
    }

    public String reverseOnlyLetters(String S) {
    int lastindex = S.length()-1;
    String ans = "";
    for (int i = 0;i<S.length() && lastindex>=0;i++){
        int ascii = (int) S.charAt(i);
        if ((ascii>=65 && ascii<90) || (ascii>=97 && ascii<=122)){
            int lastindexascii = (int) S.charAt(lastindex);
            int trm = 0;
            if ((lastindexascii>=65 && lastindexascii<90) || (lastindexascii>=97 && lastindexascii<=122)) {
                ans += S.charAt(lastindex);
                trm = 1;
            }
            lastindex--;
            if (trm!=1){

            }

        }else {
            ans+=S.charAt(i);
        }
    }
    return ans;
    }

    public int singleNumber(int[] nums) {
        LinkedList<Integer> ls = new LinkedList<Integer>();
        for (int i = 0;i<nums.length;i++){
            int temp = ls.get(nums[i]);
            temp++;
            ls.add(nums[i],temp);
        }
        for (int i = 0;i<ls.size();i++){
            if (ls.get(i)==1){
                return i;
            }
        }
        return -1;
    }

    public int minOperations(String[] logs) {
    LinkedList ls = new LinkedList();
    int point = 0;
    ls.add("Main");
    for (int i  = 0;i<logs.length;i++){
        if (logs[i].length()-1>=0) {
            if (logs[i].charAt(logs[i].length() - 1) == '/') {
                if (logs[i].length()-2 >=0) {
                    if (logs[i].charAt(logs[i].length() - 2) != '.') {
                        ls.add(logs[i].substring(0, logs[i].length() - 2));
                        point++;
                    } else {
                        if (logs[i].length() - 3 >= 0) {
                            if (logs[i].charAt(logs[i].length() - 3) == '.' && !ls.isEmpty() && point>=1) {
                                ls.pop();
                                point--;
                            }
                        }
                    }
                }
            }
        }
    }
    return point;
    }

    public String makeGood(String s) {
        LinkedList<Character> lschar = new LinkedList<Character>();
        for (int i = 0;i<s.length();i++){
            lschar.add(s.charAt(i));
        }

        int temp = 0;
        while (temp<=(s.length()+1/2)) {
            for (int i = 0; i < lschar.size()-1; i++) {
                    int upascii = (int) lschar.get(i + 1);
                    int lowscii = (int) lschar.get(i);


                if (lowscii >= 97 && lowscii <= 122 && lowscii - upascii == 32) {
                        lschar.remove(i);
                        lschar.remove(i);
                }

                if (upascii >= 97 && upascii <= 122 && upascii-lowscii == 32) {
                        lschar.remove(i);
                        lschar.remove(i);
                }

            }
            temp++;
        }

        String ans = "";
        for (int i = 0;i<lschar.size();i++){
            ans += lschar.get(i);
        }
        return ans;
    }
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
    int[][] darr = new int[R][C];
    int[][] arr = new int[1][2];
    return darr;
    }

    void prank(long[] a, int n)
    {   
        int bha = 0;
        LinkedList ls = new LinkedList();
        for (int i = 0;i<a.length && bha<a.length;i++){
            int temp = (int) a[i];
            ls.add(a[temp]);
            bha++;
        }
        for (int i = 0;i<a.length;i++){
            System.out.print(ls.get(i)+" ");
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
