package com.dsaStandard;

public class DynamicArray {

    int nextindex;
    int darr[];

    public DynamicArray(){
        darr = new int[5];
        nextindex = 0;
    }

    public void print(){
        System.out.println();
        System.out.println("Dynamic Array has :");
        for (int i = 0;i<nextindex;i++){
            System.out.print(darr[i]+" ");
        }
    }

    private void reconstruct(){
        int temp[] = darr;
        darr = new int[darr.length*2];
        for (int i = 0;i<temp.length;i++){
            darr[i] = temp[i];
        }
    }

    public void add(int n){
        if (nextindex == darr.length){
            reconstruct();
        }
        darr[nextindex] = n;
        nextindex++;

    }

    public void set(int n, int i){
        if (nextindex >= i) {
            darr[i] = n;
        }
    }

    public int get(int i){
        return darr[i];
    }

    public boolean isEmpty(){
        if (nextindex == 0){
            return true;
        }else {
            return false;
        }
    }

    public int removelast(){
        if (nextindex > 0){
            nextindex--;
            return darr[nextindex];
        }
        return -1;
    }

    public int size(){
        return this.nextindex;
    }
}
