package com.luxoft.java.course.shevtsov.homework.algorithm;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = AlgoUtilities.inputIntegers();
        System.out.println(numbers);
        System.out.println(SelectionSort.sort(numbers));
//        numbers.forEach(number -> System.out.println("for " + number + " - "
//                + CheckEqualsSumsOfNumbers.checkEqualsSumsOfNumbers(number)));
    }
}
