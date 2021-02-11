package com;

import java.util.EmptyStackException;

public class trial {
    int top = -1;
    int[] stack;
    public trial(int capacity){
        stack = new int[capacity];
    }
    public void push(int b){
        if (top==stack.length){
            //Resize
            int[] newarr = new int[2*stack.length];
            System.arraycopy(stack,0,newarr,0,stack.length);
            stack = newarr;
        }
        stack[top++] = b;
    }
    public int peek(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return stack[top-1];
    }
    public int pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        int temp = stack[--top];
        stack[top] = 0;
        return temp;
    }
    public void printArray(){
    for (int i = (top-1);i>=0;i--){
        System.out.print(stack[i]+" ");
    }
    }
    public boolean isEmpty(){
        return (top==0);
    }
    public int size(){
        return top;
    }
}
