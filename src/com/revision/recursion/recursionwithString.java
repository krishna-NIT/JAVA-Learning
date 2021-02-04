package com.revision.recursion;

public class recursionwithString {
    public static String replaceChar(String s, char a, char b){
        if (s.length()==0){
            return s;
        }
        String small = replaceChar(s.substring(1),a,b);
        if (s.charAt(0)==a){
            return b+small;
        }else {
            return s.charAt(0)+small;
        }
    }
}
