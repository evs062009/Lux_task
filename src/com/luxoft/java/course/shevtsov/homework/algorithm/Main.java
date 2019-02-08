package com.luxoft.java.course.shevtsov.homework.algorithm;

import com.luxoft.java.course.shevtsov.homework.algorithm.additionals.QuickSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] ints = {2, -1, -8, 5, -4, 6, 0, 7, -9, -3};
        System.out.println("original array: " + Arrays.toString(ints));
        int [] ints1 = QuickSort.sort(ints);
        System.out.println("sorted array: " + Arrays.toString(ints1));
    }
}
