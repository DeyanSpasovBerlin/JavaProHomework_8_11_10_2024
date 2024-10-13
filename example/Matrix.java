package org.example;

import java.util.Arrays;

public class Matrix {
    public int[][] generateMatrix(int n, int m){
        int[][] arrMat;
        arrMat = new int[n][m];
        int bufer = 0;
        if(n<m) {
            bufer = n;
        }else {
            bufer = m;
        }
        for (int i = 0; i < bufer; i++) {
            arrMat[n-1-i][i] = 1;
        }
        System.out.println("\nWe generate matrix type ("+n+"x"+m+"):");
        System.out.println(Arrays.deepToString(arrMat));
        return arrMat;
    }

    public static void print2DArray(int[][] arayOfArray) {
        System.out.println("\nThe matrix in table view is:");
        for (int i = 0; i < arayOfArray.length; i++) {
            for (int j = 0; j < arayOfArray[i].length; j++) {
                System.out.print(arayOfArray[i][j] + ", ");
            }
            System.out.print("\n");
        }
    }

}
