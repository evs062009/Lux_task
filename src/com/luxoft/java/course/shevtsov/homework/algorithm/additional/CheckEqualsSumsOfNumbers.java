package com.luxoft.java.course.shevtsov.homework.algorithm.additional;

/*
 * additional task
 * Luxoft Java course
 */
public class CheckEqualsSumsOfNumbers {
    private static final int NUMBER_HALF_LENGTH = 2;
    private static final int NUMBER_LENGTH = NUMBER_HALF_LENGTH * 2;

    // Returns true if sum of first two digits of a number is equal to sum of last two digits.
    // If a number has less than four digits, it is assumed that the missing digits are 0.
    public static boolean checkEqualsSumsOfNumbers(int number) {
        int number1 = Math.abs(number);

        if (number1 <= 9999) {
            int sumRightHalf = countSumOfCharacters(number1, NUMBER_HALF_LENGTH, NUMBER_LENGTH);
            int sumLeftHalf = countSumOfCharacters(number1, 0, NUMBER_HALF_LENGTH);
            return sumRightHalf == sumLeftHalf;
        } else {
            System.out.println("Invalid parameter! Number length should not exceed " + NUMBER_LENGTH + " characters");
            return false;
        }
    }

    private static int countSumOfCharacters(int number, int fromRegister, int toRegister) {
        int sum = 0;

        for (int register = 0; register < toRegister; register++) {
            if (register >= fromRegister) {
                sum += number % 10;
            }
            number /= 10;
        }
        return sum;
    }
}