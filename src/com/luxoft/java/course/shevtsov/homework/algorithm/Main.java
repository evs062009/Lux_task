package com.luxoft.java.course.shevtsov.homework.algorithm;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] ints = {-10, -8, -4, 0, 1, 5, 6, 9, 12, 20};
        Integer resultIndex = null;
        System.out.println("Array for searching:\t" + Arrays.toString(ints));

        for (int i = -11; i < 22; i++) {
            System.out.println("-----------------------------------------------------------------");
            System.out.println("search for " + i);
            resultIndex = BinarySearch.search(ints, i);
            if (resultIndex == null) {
                System.out.println("There is NO such element.");
            } else {
                System.out.println("index of '" + i + "' element is " + resultIndex);
            }
        }
    }
}
