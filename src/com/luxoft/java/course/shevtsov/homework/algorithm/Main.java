package com.luxoft.java.course.shevtsov.homework.algorithm;

import com.luxoft.java.course.shevtsov.homework.myUtilities.MyUtilities;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int [] ints = {-10, -8, -4, 0, 1, 5, 6, 9, 12, 20};

        System.out.println("Array for searching:\t" + Arrays.toString(ints));
        int searchNumber = MyUtilities.inputInt();
        Integer resultIndex = BinarySearch.search(ints, searchNumber);
        if (resultIndex != null) {
            System.out.println("index of '" + searchNumber + "' element is " +resultIndex);
        }
    }
}
