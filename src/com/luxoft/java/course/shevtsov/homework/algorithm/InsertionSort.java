package com.luxoft.java.course.shevtsov.homework.algorithm;

import java.util.Arrays;

public class InsertionSort {

    public static int [] sort(int [] ints) {
        int [] numbers = Arrays.copyOf(ints, ints.length);

        for (int iterCount = 1; iterCount < numbers.length; iterCount++) {
            int element = numbers[iterCount];
            int arrIndex = iterCount;
            for ( ; (arrIndex > 0) && (numbers[arrIndex - 1] > element); arrIndex--) {
                numbers[arrIndex] = numbers[arrIndex - 1];
            }
            numbers[arrIndex] = element;
        }
        return numbers;
    }
}