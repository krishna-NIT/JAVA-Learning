package com;

import java.util.LinkedList;
import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (n>=0) {
            int binar;
            LinkedList<Integer> ar = new LinkedList<Integer>();
            int rem;
            while (n != 0) {
                rem = n % 2;
                n = n / 2;
                ar.push(rem);
            }
            System.out.println(ar.size()-2);
            System.out.println(ar);
        }

        scanner.close();
    }
}

//
//
//    public static void main(String[] args) throws java.lang.Exception {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        LinkedList<Integer> sum = new LinkedList<Integer>();
//        for (int i = 0; i < n; i++) {
//            int l = scan.nextInt();
//            LinkedList<Integer> ls = new LinkedList<Integer>();
//            for (int k = 0; k < l; k++) {
//                ls.add(scan.nextInt());
//            }
//
//            for (int b =0;b<=ls.size()-3;b++){
//                for (int h =b+1;h<=ls.size()-2;h++){
//                    for (int a =h+1;a<=ls.size()-1;a++){
//                        sum.add(tripsum(ls.get(b),ls.get(h),ls.get(a)));
//                    }
//                }
//            }
//            max(sum);
//            sum.clear();;
//        }
//    }
//    public static void max(LinkedList<Integer> sum){
//        int max = sum.get(0);
//        for (int ba =0;ba<sum.size()-1;ba++){
//            if (sum.get(ba+1)>sum.get(ba)){
//                max = sum.get(ba+1);
//            }
//        }
//        System.out.println(max);
//    }
//    public static int tripsum(int a,int b,int c){
//        int temp1,temp2,temp3;
//        temp1=a-b;
//        temp2=b-c;
//        temp3=c-a;
//        if (temp1<0){
//            temp1=temp1*(-1);
//        }
//        if (temp2<0){
//            temp2=temp2*(-1);
//        }
//        if (temp3<0){
//            temp3=temp3*(-1);
//        }
//        return temp1+temp2+temp3;
//    }