package com.luxoft.java.course.shevtsov.homework.algorithm;

import java.util.List;

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

    public static int search(List<Integer> integers, Integer searchingValue) {
        if (integers.size() == 0 || !AlgoUtilities.isArrSotredByAsc(integers)) {
            System.out.println("Invalid parameters. The Array is empty or not sorted by ascending.");
            return -1;
        } else {
            int fromIndex = 0;
            int toIndex = integers.size() - 1;

            while (fromIndex != toIndex){
                if (searchingValue >= integers.get(fromIndex) && searchingValue <= integers.get(toIndex)) {
                    int baseIndex = fromIndex + ((toIndex - fromIndex) / 2);
                    if (integers.get(baseIndex).equals(searchingValue)) {
                        return baseIndex;
                    } else if (integers.get(baseIndex) > searchingValue) {
                        toIndex = baseIndex - 1;
                    } else {
                        fromIndex = baseIndex + 1;
                    }
                } else {
                    return -1;
                }
            }
            if (integers.get(fromIndex).equals(searchingValue)) {
                return fromIndex;
            } else {
                return -1;
            }
        }
    }
}