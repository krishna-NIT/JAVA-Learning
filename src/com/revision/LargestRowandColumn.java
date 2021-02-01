package com.revision;

import java.util.Scanner;

public class LargestRowandColumn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rlen = scan.nextInt();
        int clen = scan.nextInt();
        int[][] arr2d = new int[rlen][clen];

        for(int i=0;i<rlen;i++){
            for (int j=0;j<clen;j++){
                arr2d[i][j]=scan.nextInt();
            }
        }
        int[] rsum = new int[rlen];
        int[] csum = new int[clen];
        for (int i =0;i<rlen;i++){
            rsum[i] =0;
            for (int j=0;j<clen;j++){
                rsum[i]+=arr2d[i][j];
            }
            //System.out.println("sum is "+sum);
        }
        for (int i =0;i<clen;i++){
            csum[i] =0;
            for (int j=0;j<rlen;j++){
                csum[i]+=arr2d[j][i];
            }
            // System.out.println("sum is "+csum[i]);
        }
        int maxc = csum[0];
        int maxr = rsum[0];
        int indexc=0;
        int indexr=0;
        for (int i =0;i<(rlen-1);i++) {
            if (rsum[i]<rsum[i+1]){
                maxr=rsum[i+1];
                indexr=(i+1);
            }
        }
        for (int j =0; j<(clen-1);j++){
            if (csum[j]<csum[j+1]){
                maxc = csum[j+1];
                indexc=(j+1);
            }
        }
        if (maxc>maxr){
            System.out.println("Column "+indexc+" "+maxc);
        }else {
            System.out.println("Row"+indexr+" "+maxr);
        }

    }
}
