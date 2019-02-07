package com.luxoft.java.course.shevtsov.homework.algorithm;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] ints = {-10, -8, -4, 0, 1, 5, 6, 9, 12, 20};
        System.out.println("Array for searching:\t" + Arrays.toString(ints));

        for (int searchNumber = -11; searchNumber <= 21; searchNumber++) {
            System.out.println("-----------------------------------------------------------------");
            System.out.println("search for " + searchNumber);
            int resultIndex = BinarySearch.search(ints, searchNumber);

            if (resultIndex == -1) {
                System.out.println("There is NO such element.");
            } else if (resultIndex != -2){
                System.out.println("index of '" + searchNumber + "' element is " + resultIndex);
            }
        }
    }
}
