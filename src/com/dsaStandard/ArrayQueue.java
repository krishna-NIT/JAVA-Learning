package com.dsaStandard;

import java.util.NoSuchElementException;

public class ArrayQueue {
    public static class Queue{
        int[] arr;
        int start;
        int end;
        public Queue(int cap){
            arr = new int[cap];
        }
        public void add(int a){
            if (end == arr.length){
                int[] newarr = new int[2*arr.length];
                System.arraycopy(arr,0,newarr,0,arr.length);
                arr=newarr;
            }
            arr[end]=a;
            end++;
        }
        public int remove(){
            if (size()==0){
                throw new NoSuchElementException();
            }
            int temp = arr[start];
            arr[start]=0;
            start++;
            // To  Save Space & Time
            if (size()==0){
                start=0;
                end=0;
            }
            return temp;
        }
        public int peek(){
            if (size()==0){
                throw new NoSuchElementException();
            }
            return arr[start];
        }
        public int size(){
            return start-end;
        }
        public void printqueue(){
            for (int i= start;i<end;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] arg){
        Queue queue1 = new Queue(5);
        queue1.add(5);
        queue1.add(8);
        queue1.add(4);
        queue1.printqueue();
        System.out.println(queue1.peek());
        queue1.remove();
        queue1.printqueue();

    }
}
