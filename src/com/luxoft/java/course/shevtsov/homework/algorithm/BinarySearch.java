package com.luxoft.java.course.shevtsov.homework.algorithm;

public class BinarySearch {
    /*
    Class BinarySearch includes search(…)method,
    which can be used for searching int number in sorted array of ints.

    search(…) method takes an array of ints sorted by ascending, and int number as parameters.
    If array is empty or not sorted by ascending, the method issues a message and returns -1.

    search(…) method returns an index of array element which (element) equals to the searched number.
    If there are several elements satisfying the condition, the method returns an index
    of the first one found during algorithm execution.
    If there is no such element in array, the method returns -1.
     */

    public static int search(int[] ints, int searchNumber) {
        if (ints.length == 0 || !AlgoUtilities.isArrSotredByAsc(ints)) {
            System.out.println("Invalid parameters. The Array is empty or not sorted by ascending.");
            return -1;
        } else {
            int from = 0;
            int to = ints.length - 1;

            while (from != to){
                if (searchNumber >= ints[from] && searchNumber <= ints[to]) {
                    int baseIndex = from + ((to - from) / 2);
                    if (ints[baseIndex] == searchNumber) {
                        return baseIndex;
                    } else if (ints[baseIndex] > searchNumber) {
                        to = baseIndex - 1;
                    } else {
                        from = baseIndex + 1;
                    }
                } else {
                    return -1;
                }
            }
            if (ints[from] == searchNumber) {
                return from;
            } else {
                return -1;
            }
        }
    }
}