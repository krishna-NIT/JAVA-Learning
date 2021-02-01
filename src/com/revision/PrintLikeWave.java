package com.revision;

import java.util.Scanner;

public class PrintLikeWave {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Input rlen and clen
        int rlen = scan.nextInt();
        int clen = scan.nextInt();

        int[][] arr2d = new int[rlen][clen];
        // input array element
        for(int i=0;i<rlen;i++){
            for (int j=0;j<clen;j++){
                arr2d[i][j]=scan.nextInt();
            }
        }
        //Sine waye

        for (int i=0;i<clen;i++){
            for (int j=0;j<rlen ;j++){
                System.out.print(arr2d[j][i]+" ");
            }
            i++;
            if (i<clen) {
                for (int j = (rlen - 1); j >= 0; j--) {
                    System.out.print(arr2d[j][i] + " ");
                }
            }
        }

    }
}

