package com.luxoft.java.course.shevtsov.homework.algorithm.additional;

import com.luxoft.java.course.shevtsov.homework.algorithm.AlgoUtilities;

import java.util.List;

/*
 * Check if sum of first two digits of a number is equal to sum of last two digits.
 * If a number has less than four digits, it is assumed that the missing digits are 0.
 * Additional task.
 * Luxoft Java course.
 */
public class Checking {

    public static void main(String[] args) {
        List<Integer> numbers = AlgoUtilities.inputIntegers();
        numbers.forEach(number -> System.out.println("for " + number + " - "
                + CheckEqualsSumsOfNumbers.checkEqualsSumsOfNumbers(number)));
    }
}
