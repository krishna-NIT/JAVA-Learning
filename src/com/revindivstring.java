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
    public boolean threeConsecutiveOdds(int[] arr) {
        for (int i = 0;i<arr.length-2;i++) {
        if (arr[i]%2 !=0 && arr[i+1]%2 !=0 && arr[i+2]%2 !=0) {
        return true;
        }
        }
        return false;
    }
    public int[] shortestToChar(String s, char c) {
        int[] arr = new int[s.length()];
        int val;
        for (int i = 0; i < s.length(); i++) {
            val = -1;
            int front = i;
            int back = i - 1;
            int temp = 1;
            while (temp == 1) {
                if(front < s.length()){
                    if (s.charAt(front) == c) {
                        val = (i - front);
                        temp = 0;
                    }
                }
                if (front<s.length()) {
                    if (s.charAt(front) != c) {
                        if (back >= 0) {
                            if (s.charAt(back) == c && back >= 0) {
                                val = i - back;
                                temp = 0;
                            }
                        }
                    }
                }
                back--;
                front++;
            }
            if (val < 0) {
                val *= (-1);
                arr[i] = val;
            }
            arr[i] = val;
        }
        return arr;
    }

    public int[] sortByBits(int[] arr) {
        LinkedList<Integer> ls = new LinkedList<Integer>();
        for (int n = arr.length; n > 0; n--) {
            for (int i = 0; i < (n - 1); i++) {
                //if (Integer.toBinaryString(arr[i]) > Integer.toBinaryString(arr[i+1])) {
                  //  swap2(arr, i, (i + 1));
                //}
            }
        }


        int[] ar = new int[ls.size()];
        for (int i = 0;i<ls.size();i++) {
            ar[i] = ls.get(i);
        }
        return ar;
    }

    public String removeDuplicates(String S) {
        String ans = "";
        LinkedList<Character> ls = new LinkedList<Character>();
        for (int i = 0; i < S.length(); i++) {
            ls.add(S.charAt(i));
        }
        for (int i = 0;i<ls.size()-1;i++) {
            if (ls.get(i) == ls.get(i + 1)) {
                ls.remove(i);
                ls.remove(i);
                i = -1;
            }
        }
        for (int i = 0;i<ls.size();i++) {
        ans += ls.get(i).toString();
        }
        return ans;
    }
    public List<Integer> luckyNumbers (int[][] matrix) {
        LinkedList<Integer> ls = new LinkedList<Integer>();
        LinkedList<Integer> min1 = new LinkedList<Integer>();
        LinkedList<Integer> max1 = new LinkedList<Integer>();

        for (int i = 0;i<matrix[0].length;i++) {
            int max = Integer.MIN_VALUE;
            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][i] > max) {
                    max = matrix[k][i];
                }
            }
            max1.add(max);
        }

        for (int i = 0;i<matrix.length;i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
            min1.add(min);
        }
        System.out.println(min1+" "+max1);
        for (int i = 0;i<max1.size();i++) {
            if (min1.contains(max1.get(i))) {
                ls.add(max1.get(i));
            }
        }
            System.out.println(ls);
        return ls;
        }
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
    //trial check

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