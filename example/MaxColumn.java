package org.example;

import java.util.Arrays;
import java.util.Random;

public class MaxColumn {
    public int[][] generateMatrix(){
        Random rand = new Random();
        int n = rand.nextInt(2,7);
        int m = rand.nextInt(2,7);
        int[][] arrMat;
        arrMat = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arrMat[i][j] = rand.nextInt(0,50);
            }
        }
        System.out.println("\nWe generate matrix type ("+n+"x"+m+"):");
        System.out.println(Arrays.deepToString(arrMat));
        return arrMat;
    }


    public int[][] sortRows(int[][] arr){
        System.out.println(" Now we sort martrix by rows:");
        int numOfColumn = arr[0].length;
        int bufer = 0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 1; k <= j ; k++) {
                    if(arr[i][k-1] > arr[i][j]){
                        bufer = arr[i][j];
                        arr[i][j] = arr[i][k-1];
                        arr[i][k-1] = bufer;
                    }
                }
            }
        }
        return arr;
    }
    public int[][] sortColumn(int[][] arr){
        System.out.println(" Now we sort martrix by coluns:");
        int numOfRow = arr[0].length;
        int bufer = 0;
        for (int i = 0; i < arr[0].length ; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 1; k <= j ; k++) {
                    if(arr[k-1][i] > arr[j][i]){
                        bufer = arr[j][i];
                        arr[j][i] = arr[k-1][i];
                        arr[k-1][i] = bufer;
                    }
                }
            }
        }
        return arr;
    }
    public int[] maxElementRowsArr(int[][] arr){
        int[] rowsMaxArr = new int[arr.length];
        int numOfColumn = arr[0].length;
        for (int i = 0; i < arr.length; i++) {
            rowsMaxArr[i] = arr[i][numOfColumn-1];
        }
        return rowsMaxArr;
    }
    public  int[] maxElementColumnsArr(int[][] arr){
        int[] columnsMaxArr = new int[arr[0].length];
        int numOfColumn = arr[0].length;
        for (int i = 0; i < numOfColumn; i++) {
            columnsMaxArr[i] = arr[arr.length-1][i];
        }
        return columnsMaxArr;
    }

}
