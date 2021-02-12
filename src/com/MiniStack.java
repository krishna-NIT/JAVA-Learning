package com;

import java.util.LinkedList;

public class MiniStack {
    LinkedList<Integer> stack;
    public MiniStack(){
        stack = new LinkedList<Integer>();
    }
    public void push(int x) {
        stack.push(x);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        int min = Integer.MAX_VALUE;
        for (int i=0;i<stack.size();i++){
            if (min>stack.indexOf(i)){
                min = stack.indexOf(i);
            }
        }
        return min;
    }
}
