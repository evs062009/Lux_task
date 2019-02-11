package com.luxoft.java.course.shevtsov.homework.algorithm.additionals;

import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort_NoRecursoin {

    public static int[] sort(int[] ints) {
        int[] ints1 = Arrays.copyOf(ints, ints.length);

        ArrayList<int[]> pairsOfCoordinates = new ArrayList<int[]>();
        addPairCoordinates(pairsOfCoordinates, 0, ints1.length - 1);

        for (int pairNumber = 0; pairNumber < pairsOfCoordinates.size(); pairNumber++) {
            int[] currentCoordinates = pairsOfCoordinates.get(pairNumber);
            int pivotIndex = doSort(ints1, currentCoordinates[0], currentCoordinates[1]);

            if (pivotIndex != -1) {
                addPairCoordinates(pairsOfCoordinates, currentCoordinates[0], pivotIndex - 1);
                addPairCoordinates(pairsOfCoordinates, pivotIndex + 1, currentCoordinates[1]);
            }
        }
        return ints1;
    }

    private static int doSort(int[] ints, int firstIndex, int lastIndex) {
        if (firstIndex >= 0 && lastIndex < ints.length && firstIndex < lastIndex) {
            int pivotIndex = lastIndex;
            int wallIndex = firstIndex;

            while (wallIndex < lastIndex && ints[wallIndex] <= ints[pivotIndex]) {
                wallIndex++;
            }

            for (int currentIndex = wallIndex; currentIndex < lastIndex; currentIndex++) {
                if (ints[currentIndex] <= ints[pivotIndex]) {
                    QuickSort.swap(ints, currentIndex, wallIndex);
                    wallIndex++;
                }
            }
            return QuickSort.setPivotToPosition(ints, pivotIndex, wallIndex);
        }
        return -1;
    }

    private static void addPairCoordinates(ArrayList<int[]> coordinates, int firstCoordinate, int secondCoordinate) {
        int[] pair = {firstCoordinate, secondCoordinate};
        coordinates.add(pair);
    }
}