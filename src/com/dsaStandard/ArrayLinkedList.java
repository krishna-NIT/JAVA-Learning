package com.dsaStandard;

import java.util.LinkedList;
import java.util.ListIterator;

public class ArrayLinkedList {
    private LinkedList<Integer> stack;
    public ArrayLinkedList(){
        stack = new LinkedList<Integer>();
    }
    public void push(int a){
        stack.push(a);
    }
    public int pop(){
        return stack.pop();
    }
    public int peek(){
        return stack.peek();
    }
    public boolean isEmpty(){
        return stack.isEmpty();
    }
    public void pritStack(){
        ListIterator<Integer> iterator = stack.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    public static void main(String[] args){
        ArrayLinkedList als = new ArrayLinkedList();
        als.push(5);
        als.push(7);
        als.push(9);
        als.pritStack();
    }
}
