package com.luxoft.java.course.shevtsov.homework.algorithm;

import com.luxoft.java.course.shevtsov.homework.myUtilities.MyUtilities;

public class BinarySearch {

    public static Integer search(int[] ints, int searchNumber) {
        if (ints.length > 0 && !MyUtilities.ifArrSotredByAsc(ints)) {
            System.out.println("Invalid parameters. The Array is empty or not sorted by ascending.");
            return null;
        }
        return binarySearch(ints, 0, ints.length - 1, searchNumber);
    }

    private static Integer binarySearch(int[] ints, int from, int to, int searchNumber) {
        Integer resultIndex = null;

        if (searchNumber >= ints[from] && searchNumber <= ints[to]) {
            if (from == to) {
                if (ints[from] == searchNumber) {
                    resultIndex = from;
                }
            } else {
                int baseIndex = from + ((to - from) / 2);
                if (ints[baseIndex] == searchNumber) {
                    resultIndex = baseIndex;
                } else if (ints[baseIndex] > searchNumber) {
                    resultIndex =  binarySearch(ints, from, baseIndex - 1, searchNumber);
                } else {
                    resultIndex = binarySearch(ints, baseIndex + 1, to, searchNumber);
                }
            }
        }
        return resultIndex;
    }
}