package com.luxoft.java.course.shevtsov.homework.algorithm;

import com.luxoft.java.course.shevtsov.homework.myUtilities.MyUtilities;

public class BinarySearch {
    private static Integer resultIndex = null;

    public static Integer search(int[] ints, int searchNumber) {
        if (ints.length > 0 && !MyUtilities.ifArrSotredByAsc(ints)) {
            System.out.println("Invalid parameters. The Array is empty or not sorted by ascending.");
            return null;
        }
        binarySearch(ints, 0, ints.length - 1, searchNumber);
        return resultIndex;
    }

    private static void binarySearch(int[] ints, int from, int to, int searchNumber) {
        if (from == to) {
            if (ints[from] == searchNumber) {
                resultIndex = from;
            } else {
                System.out.println("There is NO such element.");
            }
            return;
        }

        int baseIndex = from + ((to - from) / 2);

        if (ints[baseIndex] == searchNumber) {
            resultIndex = baseIndex;
        } else if (ints[baseIndex] > searchNumber) {
            to = baseIndex - 1;
            if (searchNumber > ints[to]){
                System.out.println("There is NO such element.");
            } else {
                binarySearch(ints, from, to, searchNumber);
            }
        } else {
            from = baseIndex + 1;
            if (searchNumber < ints[from]){
                System.out.println("There is NO such element.");
            } else {
                binarySearch(ints, from, to, searchNumber);
            }
        }
    }
}