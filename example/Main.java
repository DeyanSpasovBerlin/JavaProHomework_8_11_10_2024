package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArraySort arrSort = new ArraySort();
        int[] array1 = {8,15,6,28,14,3,7};
        int[] array2 = {111,100,47,99,5,-55,7,8,8,8,3};
        arrSort.sortArray(array1);
        arrSort.sortArray(array2);


        Matrix matrix = new Matrix();
        matrix.print2DArray(matrix.generateMatrix(4,3));
        matrix.print2DArray(matrix.generateMatrix(3,4));

        MaxColumn mxcl = new MaxColumn();

        int[][] randMatr = mxcl.generateMatrix();// generate random matrix
        matrix.print2DArray(randMatr);

        int[][] randMatrSortRows =  mxcl.sortRows(randMatr);//sort matrix by rows
        matrix.print2DArray(randMatrSortRows);

        int[] arrMaxRows = mxcl.maxElementRowsArr(randMatrSortRows);//make array from max element in each rows
        System.out.println("arrMaxRows =" + Arrays.toString(arrMaxRows));

        int[][] randMatrSortColumns =  mxcl.sortColumn(randMatr);//sort by coluns
        matrix.print2DArray(randMatrSortColumns);


        int[] arrMaxColumns = mxcl.maxElementColumnsArr(randMatrSortColumns);//make array from max element in each colunss
        System.out.println("arrMaxColumns =" + Arrays.toString(arrMaxColumns));
    }
}