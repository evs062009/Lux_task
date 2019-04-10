package com.luxoft.java.course.shevtsov.homework.algorithm;

import java.util.List;

/*
 * Sorting of Integers list
 * Homework.
 * Luxoft Java course.
 */
public class Sorting {

    public static void main(String[] args) {
        List<Integer> numbers = AlgoUtilities.fillIntegers(7);
        System.out.println("original list " + numbers);
        System.out.println("sorted list " + MergeSort.sort(numbers));
    }
}
