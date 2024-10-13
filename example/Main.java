package org.example;

public class Main {
    public static void main(String[] args) {
        ArraySort arrSort = new ArraySort();
        Integer[] array1 = {8,15,6,28,14,3,7};
        Integer[] array2 = {111,100,47,99,5,-55,7,8,8,8,3};
        arrSort.sortArray(array1);
        arrSort.sortArray(array2);


        Matrix matrix = new Matrix();
        matrix.print2DArray(matrix.generateMatrix(4,3));
        matrix.print2DArray(matrix.generateMatrix(3,4));

    }
}