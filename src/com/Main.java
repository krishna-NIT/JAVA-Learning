package com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (candivide(n)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
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
}
