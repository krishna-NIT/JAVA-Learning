package com.revision;

import com.revision.recursion.LinkedlistStackChar;

public class trial {
    public static void main(String[] args) {
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        System.out.println();
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        System.out.println();
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println();
        // should return false
        System.out.println(checkForPalindrome("hello"));
        System.out.println();
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
        System.out.println();
    }

    public static boolean checkForPalindrome(String abc) {
        System.out.println(abc);
        String string = abc.toLowerCase();
        LinkedlistStackChar stack = new LinkedlistStackChar();
        StringBuilder temp1 = new StringBuilder(string.length());

        for (int i =0;i<string.length();i++){
            char c= string.charAt(i);
            if (c >= 'a' && c<='z') {
                temp1.append(string.charAt(i));
                stack.push(string.charAt(i));
            }
        }
        StringBuilder rev = new StringBuilder();
        while (!stack.isEmpty()){
            rev.append(stack.pop());
        }
        System.out.println(temp1.toString());
        System.out.println(rev.toString());
        if (temp1.toString().equals(rev.toString())){
            return true;
        }else {
            return false;
        }
    }
}
