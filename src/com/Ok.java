package com;

import java.util.ArrayList;
import java.util.Scanner;

public class Ok {
    public static void main(String[] args) {
        ArrayList<Integer> ls = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n<=500) {
            for (int i = 0; i < n; i++) {
                int summ = 0;
                int l = scan.nextInt();
                for (int k = 0; k < l; k++) {
                    ls.add(scan.nextInt());
                }
                for (int b = 0; b <= (ls.size() - 3); b++) {
                    for (int h = b + 1; (h <= ls.size() - 2); h++) {
                        for (int a = h + 1; a <= (ls.size() - 1); a++) {
                            int tot = tripsum(ls.get(b), ls.get(h), ls.get(a));
                            if (tot > summ) {
                                summ = tot;
                            }
                        }
                    }
                }
                System.out.println(summ);
                ls.clear();
            }

        }
    }

    public static int tripsum(int a, int b, int c) {
        int sum;
        if ((a - b) < 0) {
            sum=0;
            sum += (b - a);
        } else {
            sum=0;
            sum += (a - b);
        }
        if ((c - b) < 0) {
            sum += (b - c);
        } else sum += (c - b);
        if ((a - c) < 0) {
            sum += (c - a);
        } else {sum += (a - c);}

        return sum;
    }
}
