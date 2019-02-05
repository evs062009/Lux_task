package com.luxoft.java.course.shevtsov.homework.algorithm;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int [] ints = {5, 7, 1, 3, 2, 0};

        System.out.print("original array:\t");
        System.out.println(Arrays.toString(ints));
        int [] sortedArr = SelectionSort.sort(ints);
        System.out.print("sorted array:\t");
        System.out.println(Arrays.toString(sortedArr));
    }
}
