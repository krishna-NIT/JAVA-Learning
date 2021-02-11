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
        String string = abc.toLowerCase();
        System.out.println(string);

        LinkedlistStackChar<char> stack = new LinkedlistStackChar<char>();
        for (int i=0;i<string.length();i++) {
            if (Character.isUpperCase(string.charAt(i)) ||
                    Character.isDigit(string.charAt(i)) ||
                    Character.isLowerCase(string.charAt(i))) {
                stack.push(string.charAt(i));
            }
        }
        int n =stack.size()-1;
        LinkedlistStackChar temp = new LinkedlistStackChar();
        for (int i=0;i<string.length();i++) {
            if (Character.isUpperCase(string.charAt(i)) ||
                    Character.isDigit(string.charAt(i)) ||
                    Character.isLowerCase(string.charAt(i))) {
                temp.push(string.charAt(i));
            }
        }

        LinkedlistStackChar stackrev = new LinkedlistStackChar();
        for (int i = n;i>=0;i--){
            stackrev.push(stack.pop());
        }
        temp.printaa();
        stackrev.printaa();


        int count=0;
        int len = stackrev.size();
        for (int i =len;i>1;i++){
            if (Character.compare(stackrev.pop(),temp.pop())){
                count++;
            }
        }
//        System.out.println(count);
//        if (count==(len)){
//            return true;
//        }else {
//            return false;
//        }
    return false;
    }
}
