package com.revision;

import java.util.Scanner;

public class CamelCase {
    static int camelcase(String s) {
        int count =0;
        for (int i=0;i<s.length();i++){
        if (Character.isUpperCase(s.charAt(i))){
            count++;
        }
    }
        return (count+1);

    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        int ans = camelcase(a);
        System.out.println(ans);
        }
}
