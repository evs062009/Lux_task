package com.luxoft.java.course.shevtsov.homework.algorithm.additionals;

import java.util.Arrays;

public class QuickSort {

    public static int [] sort(int [] ints){
        int [] ints1 = Arrays.copyOf(ints, ints.length);
        recursSort(ints1, 0, ints1.length - 1);
        return ints1;
    }

    private static void recursSort (int [] ints, int firstIndex, int pivot){

        //
        System.out.print("input arr");
        printArr(ints, firstIndex, pivot);
        //

        if (firstIndex >=0 && pivot < ints.length && firstIndex != pivot) {
            int wallIndex = firstIndex;

            while (ints[wallIndex] <= ints[pivot]){
                wallIndex++;
            }

            for (int currentIndex = wallIndex; currentIndex < pivot; currentIndex++) {
                if (ints[currentIndex] <= ints[pivot]) {
                    int temp = ints[currentIndex];
                    ints[currentIndex] = ints[wallIndex];
                    ints[wallIndex] = temp;
                    wallIndex++;
                }
            }

            int pivotElement = ints[pivot];
            for (int i = pivot; i < wallIndex; i++) {
                ints[i] = ints[i-1];
            }
            ints[wallIndex] = pivotElement;

            recursSort(ints, firstIndex, wallIndex - 1);
            recursSort(ints, wallIndex + 1, pivot);
        }

        //
        System.out.print("output arr");
        printArr(ints, firstIndex, pivot);
        //
    }

    //!!! for testing, delete
    private static void printArr(int [] ints, int from, int to){
        System.out.print("[");
        for (int i = from; i <= to; i++) {
            System.out.print(ints[i] + ", ");
        }
        System.out.println("]");
    }
    //
}
