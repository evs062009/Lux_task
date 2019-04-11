package com.luxoft.java.course.shevtsov.homework.algorithm;

import java.util.List;

/*
 * Realizes binary search algorithm in list of integers.
 * Luxoft Java course homework.
 */
class BinarySearch {

    /**
     * Search integer in list of integers.
     *
     * @param integers      list of integers (has to be sorted previously).
     * @param searchedValue integer which is searched.
     * @return an index of searched element (if there are several elements satisfying the condition,
     * returns an index of the first found one).
     * Or -1 if there is no such element in list or list is empty or not sorted.
     */
    static int search(List<Integer> integers, Integer searchedValue) {
        if (integers.isEmpty() || !AlgoUtilities.isArrSotredByAsc(integers)) {
            System.out.println("Invalid parameters. The Array is empty or not sorted by ascending.");
        } else {
            int fromIndex = 0;
            int toIndex = integers.size() - 1;
            while (fromIndex <= toIndex) {
                if (searchedValue.equals(integers.get(fromIndex))) {
                    return fromIndex;
                }
                if (searchedValue.equals(integers.get(toIndex))) {
                    return toIndex;
                }
                if (searchedValue > integers.get(fromIndex) && searchedValue < integers.get(toIndex)) {
                    int baseIndex = fromIndex + ((toIndex - fromIndex) / 2);
                    if (searchedValue.equals(integers.get(baseIndex))) {
                        return baseIndex;
                    }
                    if (searchedValue > integers.get(baseIndex)) {
                        fromIndex = baseIndex + 1;
                        toIndex--;
                    } else {
                        toIndex = baseIndex - 1;
                        fromIndex++;
                    }
                } else {
                    return -1;
                }
            }
        }
        return -1;
    }
}