package com.dsaStandard;

public class ArrayStack {
    int[] stack;
    int top=-1;
    public ArrayStack(int capacity){
        stack = new int[capacity];
    }
    public void add(int a){
        if (top == stack.length){
            //Resize Array
            int[] newarr = new int[2*stack.length];
            System.arraycopy(stack,0,newarr,0,stack.length);
            stack = newarr;
        }
        stack[top++]=a;
    }
    public int pop(){
        if (isEmpty()){

        }
        int temp = stack[top--];
        stack[top] = 0;
        return temp;
    }
    public boolean isEmpty(){
        return (top==0);
    }
    public static void main(String[] args){

    }
}
