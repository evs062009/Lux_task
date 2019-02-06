package com.luxoft.java.course.shevtsov.homework.algorithm;

import java.util.Arrays;

public class BubbleSort {

    public static int [] sort(int [] ints) {
        int [] numbers = Arrays.copyOf(ints, ints.length);
        boolean noSwap = true;

        for (int iterCount = numbers.length - 1; iterCount > 0; iterCount--) {
            for (int arrIndex = 0; arrIndex < iterCount; arrIndex++) {
                if (numbers[arrIndex] > numbers[arrIndex + 1]){
                    int temp = numbers[arrIndex];
                    numbers[arrIndex] = numbers[arrIndex + 1];
                    numbers[arrIndex + 1] = temp;
                    noSwap = false;
                }
            }
            if (noSwap){
                break;
            }
        }
        return numbers;
    }
}
