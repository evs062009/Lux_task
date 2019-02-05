package com.luxoft.java.course.shevtsov.homework.algorithm;

import java.util.Arrays;

public class SelectionSort {

    public static int [] sort(int [] ints) {
        int [] newArr = Arrays.copyOf(ints, ints.length);
        for (int i = 0; i < newArr.length - 1; i++) {
            int min = newArr[i];
            int minIndex = i;
            for (int j = i + 1; j < newArr.length; j++) {
                if (newArr[j] < min) {
                    min = newArr[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = newArr[minIndex];
                newArr[minIndex] = newArr[i];
                newArr[i] = temp;
            }
        }
        return newArr;
    }
}
