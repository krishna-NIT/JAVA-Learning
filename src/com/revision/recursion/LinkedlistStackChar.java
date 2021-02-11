package com.revision.recursion;
import java.util.LinkedList;

public class LinkedlistStackChar {
    private LinkedList<Character> stack;
    public LinkedlistStackChar(){
        stack = new LinkedList<Character>();
    }
    public void push(char a){
        stack.push(a);
    }
    public char pop(){
        return stack.pop();
    }
    public char peek(){
        return stack.peek();
    }
    public boolean isEmpty(){
        return stack.isEmpty();
    }
    public int size(){
        return stack.size();
    }
    public void printaa(){
        System.out.println(stack);
    }
}
