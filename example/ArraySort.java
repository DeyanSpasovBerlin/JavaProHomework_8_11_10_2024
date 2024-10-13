package org.example;

import java.util.Arrays;

public class ArraySort {
    public Integer[] sortArray(Integer[] arr){
        Integer[] arrCopy = Arrays.copyOf(arr, arr.length);
        int bufer = 0;
        int caseInversion = 1;
        int stepOfSorting = 1;
        System.out.println("The original array is: \n"+Arrays.toString(arr));
        System.out.println("\nIn proces of checking we find next inversion: ");
        for (int i = 0; i < arr.length-2; i++) {
            if(arr[i] > arr[i+1]){
                System.out.println(caseInversion+" case of inversion: array["+i+"] = "+arr[i]+" is great then array["+(i+1)+"] = "+arr[i+1]+".\n");
                caseInversion++;
            }
        }
        System.out.println("Now we are sorting the original array. \n");
        for (int j = 1; j < arrCopy.length; j++) {

            for (int i = 1; i <= j; i++) {
                if(arrCopy[i-1] > arrCopy[j]){
                    bufer = arrCopy[j];
                    arrCopy[j] = arrCopy[i-1];
                    arrCopy[i-1] = bufer;
                    System.out.println("\n"+stepOfSorting+". Step of sorting:");
                    System.out.println(Arrays.toString(arrCopy));
                    stepOfSorting++;
                }
            }
        }
        System.out.println("\nThe original array is: \n"+Arrays.toString(arr));
        System.out.println("\nAfter sorting the new array is: ");
        System.out.println(Arrays.toString(arrCopy));
        return  arrCopy;
    }
}
