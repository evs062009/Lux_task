package com.luxoft.java.course.shevtsov.homework.algorithm;

import com.luxoft.java.course.shevtsov.homework.myUtilities.MyUtilities;

public class BinarySearch {
    /*
    Class BinarySearch includes search(…)method,
    which can be used for searching int number in sorted array of ints.

    search(…) method takes an array of ints sorted by ascending, and int number as parameters.
    If array is empty or not sorted by ascending, the method issues a message and returns null.

    search(…) method returns an index of array element which (element) equals to the searched number.
    If there are several elements satisfying the condition, the method returns an index
    of the first one found during algorithm execution.
    If there is no such element in array, the method returns null.
     */

    public static Integer search(int[] ints, int searchNumber) {
        if (ints.length == 0 || !MyUtilities.isArrSotredByAsc(ints)) {
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
                    resultIndex = binarySearch(ints, from, baseIndex - 1, searchNumber);
                } else {
                    resultIndex = binarySearch(ints, baseIndex + 1, to, searchNumber);
                }
            }
        }
        return resultIndex;
    }
}