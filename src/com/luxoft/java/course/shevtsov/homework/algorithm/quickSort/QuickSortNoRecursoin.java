package com.luxoft.java.course.shevtsov.homework.algorithm.quickSort;

import java.util.ArrayList;
import java.util.List;

public class QuickSortNoRecursoin {

    public static List<Integer> sort(List<Integer> integers) {
        List<Integer> list = new ArrayList<>(integers);
        ArrayList<int[]> pairsOfCoordinates = new ArrayList<>();

        addPairCoordinates(pairsOfCoordinates, 0, list.size() - 1);

        for (int pairNumber = 0; pairNumber < pairsOfCoordinates.size(); pairNumber++) {
            int[] currentCoordinates = pairsOfCoordinates.get(pairNumber);
            int pivotIndex = QuickSort.sortIteration(list, currentCoordinates[0], currentCoordinates[1]);

            if (pivotIndex != -1) {
                addPairCoordinates(pairsOfCoordinates, currentCoordinates[0], pivotIndex - 1);
                addPairCoordinates(pairsOfCoordinates, pivotIndex + 1, currentCoordinates[1]);
            }
        }
        return list;
    }

    private static void addPairCoordinates(ArrayList<int[]> coordinates, int firstCoordinate, int secondCoordinate) {
        int[] pair = {firstCoordinate, secondCoordinate};
        coordinates.add(pair);
    }
}