package com.revision;

import java.util.Scanner;

public class remdub {
    static String superReducedString(String s) {
        char temp= 'a';
        StringBuilder sb = new StringBuilder(s.length());
        for (int i=0;i<(s.length()-1);i++){
            if (s.charAt(i)!=s.charAt(i+1)){
                sb.append(s.charAt(i));
                temp = s.charAt(i);
            }
        }


        if ((s.charAt(s.length()-1))!=temp){
            sb.append(s.charAt(s.length()-1));
        }
    return sb.toString();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        System.out.println(superReducedString(a));
    }

}
