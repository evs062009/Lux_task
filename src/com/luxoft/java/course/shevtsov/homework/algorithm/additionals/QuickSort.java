package com.luxoft.java.course.shevtsov.homework.algorithm.additionals;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class QuickSort {

    public static int[] sort(int[] ints) {
        int[] ints1 = Arrays.copyOf(ints, ints.length);
        recursSort(ints1, 0, ints1.length - 1);
        return ints1;
    }

    private static void recursSort(int[] ints, int firstIndex, int lastIndex) {
        if (firstIndex >= 0 && lastIndex < ints.length && firstIndex < lastIndex) {
            int pivotIndex = lastIndex;
            int wallIndex = firstIndex;

            while (wallIndex < lastIndex && ints[wallIndex] <= ints[pivotIndex]) {
                wallIndex++;
            }

            for (int currentIndex = wallIndex; currentIndex < lastIndex; currentIndex++) {
                if (ints[currentIndex] <= ints[pivotIndex]) {
                    swap(ints, currentIndex, wallIndex);
                    wallIndex++;
                }
            }
            setPivotToPosition(ints, pivotIndex, wallIndex);
            recursSort(ints, firstIndex, wallIndex - 1);
            recursSort(ints, wallIndex + 1, pivotIndex);
        }
    }

    static void swap(@NotNull int [] ints, int index1, int index2){
        int temp = ints[index1];
        ints[index1] = ints[index2];
        ints[index2] = temp;
    }

    static int setPivotToPosition(@NotNull int [] ints, int pivotIndex, int wallIndex){

        //
//        System.out.println("arr at start satPivot" + Arrays.toString(ints));
//        System.out.println("pivotIndex = " + pivotIndex);
//        System.out.println("wallIndex = " + wallIndex);
        //

        int pivotElement = ints[pivotIndex];
        for (int index = pivotIndex; index > wallIndex; index--) {
            ints[index] = ints[index - 1];
        }
        ints[wallIndex] = pivotElement;

        //
//        System.out.println("arr at finish satPivot" + Arrays.toString(ints));
        //

        return wallIndex;
    }
}
