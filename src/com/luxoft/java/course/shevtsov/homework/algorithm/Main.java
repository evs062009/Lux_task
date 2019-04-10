package com.luxoft.java.course.shevtsov.homework.algorithm;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = AlgoUtilities.fillIntegers(5);
        System.out.println("original list " + numbers);
        System.out.println("sorted list" + MergeSort.sort(numbers));
//        numbers.forEach(number -> System.out.println("for " + number + " - "
//                + CheckEqualsSumsOfNumbers.checkEqualsSumsOfNumbers(number)));
    }
}
