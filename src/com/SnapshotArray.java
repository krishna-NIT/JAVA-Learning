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
