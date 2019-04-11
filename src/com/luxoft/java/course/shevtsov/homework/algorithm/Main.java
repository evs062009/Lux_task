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
        List<Integer> numbers = AlgoUtilities.fillIntegers(1);
        System.out.println("original list " + numbers);
        numbers = QuickSortNoRecursoin.sort(numbers);
        System.out.println("sorted list " + numbers);

        Integer searchedEl = 0;
        System.out.println("searched element = " + searchedEl + "," +
                "element Index = " + BinarySearch.search(numbers, searchedEl));
    }
}
