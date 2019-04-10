package com.luxoft.java.course.shevtsov.homework.algorithm.quickSort;

import com.luxoft.java.course.shevtsov.homework.algorithm.AlgoUtilities;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {

    public static List<Integer> sort(List<Integer> integers) {
        List<Integer> list = new ArrayList<>(integers);
        recursSort(list, 0, list.size() - 1);
        return list;
    }

    private static void recursSort(List<Integer> integers, int firstIndex, int lastIndex) {
        int wallIndex = sortIteration(integers, firstIndex, lastIndex);
        if (wallIndex != -1){
            recursSort(integers, firstIndex, wallIndex - 1);
            recursSort(integers, wallIndex + 1, lastIndex);
        }
    }

    static int sortIteration(List<Integer> integers, int firstIndex, int lastIndex) {
        if (firstIndex >= 0 && lastIndex < integers.size() && firstIndex < lastIndex) {
            int wallIndex = firstIndex;
            while (wallIndex < lastIndex && integers.get(wallIndex) <= integers.get(lastIndex)) {
                wallIndex++;
            }
            for (int currentIndex = wallIndex; currentIndex < lastIndex; currentIndex++) {
                if (integers.get(currentIndex) <= integers.get(lastIndex)) {
                    AlgoUtilities.swap(integers, currentIndex, wallIndex);
                    wallIndex++;
                }
            }

            Integer pivotElement = integers.get(lastIndex);
            for (int index = lastIndex; index > wallIndex; index--) {
                integers.set(index, integers.get(index - 1));
            }
            integers.set(wallIndex, pivotElement);
            return wallIndex;
        } else {
            return -1;
        }
    }
}
