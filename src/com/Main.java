package com;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 0;i<n;i++){
            int val = scan.nextInt();
            countOrdinary(val);
        }
    }
    public static void countOrdinary(int num){
        int count = 0;
        int numdig = countdigits(num);

        if (numdig >=2) {
            count += 9 * (numdig - 1);

//            double tem = Math.pow(10,numdig-1);
//            int temp = (int) tem;

            int oneoneone = 0;
            for (int i = 1;i<=numdig;i++){
                oneoneone = oneoneone*10 +1;
            }

            int div = num/oneoneone;
            count += div;
//            for (int i = temp;i<=num;i++){
//                if (isOrdinary(i)){
//                    count++;
//                }
//            }


            System.out.println(count);
        }else{
            System.out.println(num);
        }
    }

    public static boolean isOrdinary(int n){
//        if (n<=9 && n>=1){
//            return true;
//        }
        int rem = n%10;
        n /= 10;
        while (n > 0){
            int rem2 = n%10;
            n/=10;
            if (rem2!=rem){
                return false;
            }
        }
        return true;
    }

    public static int countdigits(int n){
        int count = 0;
        while (n>0){
            n /=10;
            count++;
        }
        return count;
    }


    public static int findUnique(int[] arr) {
        LinkedList<Integer> ls = new LinkedList<>();
        for (int i = 0;i<arr.length;i++){
            ls.add(arr[i]);
        }

        for (int i = 0;i<arr.length;i++){
            int num = arr[i];
            int a = 0;
            if (ls.contains(num)){

            }else {

            }
        }
        return  ls.size();
    }


    public int[] deckRevealedIncreasing(int[] deck) {

        // Sorting Deck small to largest
        int nn = 0;
        Arrays.sort(deck);
        if ( deck.length %2 == 0){
            nn = deck.length / 2;
        }else{
            nn = (deck.length/2) +1;
        }
        int[] dec1 = new int[nn];
        int[] dec2 = new int[deck.length/2];

        for (int i = 0 ; i<dec1.length ; i+=2){
            dec1[i] = deck[i];
        }
        for (int i = 0 ; i<dec2.length ; i+=2){
            dec2[i] = deck[deck.length - dec2.length +i];
        }

        int k = 0;
        int l = 0;
        for (int i = 0 ; i<deck.length ; i+=2){
            deck[i] = dec1[k];
            k++;

            if(i+1 < deck.length){
                deck[i+1] = dec2[l];
                l++;
            }
        }

        return deck;
    }


    public static int staircase(int n){

        /* Your class should be named Solution.
         * Don't write main() function.
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        int count = 0;
        if( n == 1){
            return 1;
        }else if(n == 2){
            return 2;
        }else if (n == 3){
            return 4;
        }


        return (1*staircase(n-1)) + (2*staircase(n-2)) + (4* staircase(n-3));

    }


    public static String removeConsecutiveDuplicates(String s) {

        String str= "";
        for(int i = 0 ;i <s.length()-1;i++){
            if (s.charAt(i) == s.charAt(i+1)){

                String sechalf = s.substring(i+2,s.length());

                if (i == s.length()-2){
                    if (s.charAt(s.length()-1) == s.charAt(s.length()-2)){
                        sechalf = "";
                    }
                }

                str = s.substring(0,i+1) + sechalf;
                return removeConsecutiveDuplicates(str);
            }



        }
        return s;
    }

    public static boolean candivide(int n){
        for (int i = 2;i<n;i+=2){
            int temp = n-i;
            if (temp %2 == 0){
                return true;
            }
        }
        return false;
    }

//        int m = scan.nextInt();
//        int count = 0;
//        for (int i = 0;i<=s;i++){
//            for (int j = 0;j<=s;j++){
//                for (int k = 0;k<=s;k++){
//                    int sum = i+j+k;
//                    int mul = i*j*k;
//
//                    if (sum<=s && mul<=m){
//                        count++;
//                    }
//                }
//            }
//        }
//        System.out.println(count);
}
