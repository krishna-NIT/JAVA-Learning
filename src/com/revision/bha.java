package com.revision;

import java.util.LinkedList;

public class bha {
    public static void main(String[] args) {
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String string) {
        string=string.toLowerCase();
        LinkedList stack = new LinkedList();
        LinkedList queue = new LinkedList();
        for (int i=0;i<string.length();i++){
        if (string.charAt(i)>'a' && string.charAt(i)<'z'){
            queue.add(string.charAt(i));
            stack.push(string.charAt(i));
        }
        }
        int count=0;
        int size = stack.size();
        while (!stack.isEmpty()){
            if (stack.pop().equals(queue.remove())){
                count++;
            }
        }

        if (count==size){
         return true;
        }else {
            return false;
        }
        }
}
