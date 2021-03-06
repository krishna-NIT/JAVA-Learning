package com.dsaStandard;

import java.util.EmptyStackException;

public class ArrayStack {
    int[] stack;
    int top;
    public static void main(String[] args){
        ArrayStack a1 = new ArrayStack(5);
        a1.push(5);
        a1.push(8);
        a1.push(9);
        a1.priintStack();
        System.out.println(a1.peek());

    }
    public ArrayStack(int capacity){
        stack = new int[capacity];
    }
    public void push(int a){
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
            throw new EmptyStackException();
        }
        //Stack me --Top Kiya hai Bachke Yaad kar
        int temp = stack[--top];
        stack[top] = 0;
        return temp;
    }
    public boolean isEmpty(){
        return (top==0);
    }
    public int peek(){
        if (top==0){
            throw new EmptyStackException();
        }
        return stack[top-1];
    }
    public int size(){
        return (top);
    }
    public void priintStack(){
        for (int i =(top-1);i>=0;i--){
            System.out.print(stack[i]+" ");
        }
    }

}
