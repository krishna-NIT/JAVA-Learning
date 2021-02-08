package com.revision;

import java.util.Scanner;

public class CamelCase {
    static String hackerrankInString(String s) {
        int count=0;
        int kri =0,vis=0,bha=0,r3i=0,a3i=0,k3i=0;
        //int h=0,a=0,c=0,k=0,e=0,r=0,r2=0,a2=0,n=0,k2=0;
        int hi=-1,ai=-1,ci=-1,ki=-1,ei=-1,ri=-1,r2i=-1,a2i=-1,ni=-1,k2i=-1;
    for (int i =0;i<s.length();i++){
        if (s.charAt(i)=='h'){
            hi=i;
        }

        if (s.charAt(i)=='c'){
            ci=i;
        }

        if (s.charAt(i)=='e'){
            ei=i;
        }
        if (s.charAt(i)=='r'){
            r3i=i;
            kri++;
        }
        if (kri == 2){
            r2i=r3i;
        }
        if (kri == 1){
            ri=r2i;
        }
        if (s.charAt(i)=='a'){
            a3i=i;
            bha++;
        }
        if (bha ==2){
            a2i=a3i;
        }
        if (bha == 1){
            ai=a2i;
        }
        if (s.charAt(i)=='n'){
            ni=i;
        }
        if (s.charAt(i)=='k'){
            k3i=i;
            vis++;
        }
        if (vis==2){
            k2i=k3i;
        }
        if (vis == 1){
            ki=k2i;
        }
    }
    if (hi<ai && ai<ci && ci<ki && ki<ei && ei<r2i && r2i<a2i && a2i<ni && ni<k2i ){
        return "YES";
    }else {
        return "NO";
    }

    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        for (int i=0;i<n;i++) {
            System.out.println(hackerrankInString(scan.nextLine()));
        }

        }
}
