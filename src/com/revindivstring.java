/*
Here we will take input of String and then we will find index of space occured in
String, then upto that index we will reverse word & will add in temp String using
Concatenation & at last will reverse last word & hence will return the string temp
*/

package com;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class revindivstring {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int l = scan.nextInt();
        int r = scan.nextInt();
        selfDividingNumbers(l,r);

    }

    public List<String> commonChars(String[] A) {
        LinkedList<String> lsc = new LinkedList<String>();
        LinkedList<Character> aa = new LinkedList<Character>();
    for (int i = 0;i<A[0].length();i++){
        char temp = A[0].charAt(i);
        aa.add(temp);
    }

    for (int i = 0;i<aa.size();i++){
        int temp = 0;
        String chtostr = aa.get(i).toString();
        for (int j = 0;j<A.length;j++){
            if (!A[j].contains(chtostr)){
                temp = 1;
                break;
            }else {
                int bhu = A[j].indexOf(chtostr);
            }
        }
        if (temp == 0){
            lsc.add(chtostr);
        }
    }
        return lsc;
    }

    public boolean canMakeArithmeticProgression(int[] arr) {
        for (int n = arr.length; n > 0; n--) {
            for (int i = 0; i < (n - 1); i++) {
                if (arr[i] > arr[i + 1]) {
                    swap2(arr, i, (i + 1));
                }
            }
        }
        int d = arr[1]-arr[0];
        for (int i = 0;i<arr.length-1;i++) {
            if (arr[i + 1] - arr[i] != d) {
                return false;
            }
        }
        return true;
    }
    public static void swap2(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }



    public static List<Integer> selfDividingNumbers(int left, int right) {
        LinkedList<Integer> ls = new LinkedList<Integer>();
        for (int i = left;i<=right;i++){
            if (selfdivno(i)){
                ls.add(i);
            }
        }
        System.out.println(ls);
        return ls;
    }
    public static boolean selfdivno(int i){
        int num = i;
        int temp = 0;
        LinkedList<Integer> ls2 = new LinkedList<>();
        while (i>0){
            int d = i%10;
            ls2.add(d);
            i/=10;
        }
        if (ls2.contains(0)){
            return false;
        }else {
            for (i = 0;i<ls2.size();i++){
                if (num%ls2.get(i) != 0){
                    temp = 1;
                }
            }
        }
        if (temp == 1){
            return false;
        }
        return true;
    }


    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int temp = 4;
        if (n>0){
            for (int i = 0;i<=(n/2-1);i++){
                arr[i] = temp;
                arr[n-1-i] = (-1*temp);
                temp++;
            }
        }
        if (n%2!=0){
            arr[n/2] = 0;
        }
        return arr;
    }
    public static int maximum69Number (int num) {
        int temp = num;
        int len = 0;
        LinkedList<Integer> ls = new LinkedList<Integer>();
        while (temp > 0) {
            ls.add(temp%10);
            temp/=10;
        }
        System.out.println(ls);
        for (int i = ls.size()-1;i>=0 && len == 0;i--){
            if (ls.get(i) == 6){
                ls.remove(i);
                ls.add(i,9);
                len = 1;
            }
        }
        int num1 = 0;
        for (int i = ls.size()-1;i>=0;i--){
            num1 += (ls.get(i)*Math.pow(10,i));
        }
        return num1;
    }
    public static String RevIndivString(String txt){
        String temp = "";
        int carry = 0;
        for (int i = 0;i<txt.length();i++){
            if (txt.charAt(i) == ' '){
                for (int j = i-1;j>=carry;j--){
                    temp += txt.charAt(j);
                }
                temp += ' ';
                carry = i+1;
            }

        }
        for (int i = txt.length()-1;i>=carry;i--){
            temp += txt.charAt(i);
        }
        return temp;
    }
}
/*
    Test Cases:
        Input: He is Good
        Output: eH si dooG

        Input: I am krishna-NIT
        Output: I ma TIN-anhsirk

        Time Complexity: O(n)
        Space Complexity: O(1)


 */