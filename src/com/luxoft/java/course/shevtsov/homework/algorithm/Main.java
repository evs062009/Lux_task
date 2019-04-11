package com.luxoft.java.course.shevtsov.homework.algorithm;

import com.luxoft.java.course.shevtsov.homework.algorithm.quickSort.QuickSortNoRecursoin;

import java.util.List;

/*
 * Main for Integers list processing (sorting and searching).
 * Homework.
 * Luxoft Java course.
 */
public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = AlgoUtilities.fillIntegers(7);
        System.out.println("original list " + numbers);
        numbers = QuickSortNoRecursoin.sort(numbers);
        System.out.println("sorted list " + numbers);

        Integer searchingEl = 4;
        System.out.println("searchingIndex = " + BinarySearch.search(numbers, searchingEl));
    }
}
