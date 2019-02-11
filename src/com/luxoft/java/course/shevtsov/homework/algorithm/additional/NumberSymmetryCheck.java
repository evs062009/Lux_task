package com.luxoft.java.course.shevtsov.homework.algorithm.additional;

public class NumberSymmetryCheck {

    public static boolean checkNumberSymmetry(int number) {
        int number_half_length = 2;
        int number_length = number_half_length * 2;
        int number1 = Math.abs(number);

        if (number1 <= 9999) {
            int sumRightHalf = countSumOfCharacters(number1, number_half_length, number_length);
            int sumLeftHalf = countSumOfCharacters(number1, 0, number_half_length);
            return sumRightHalf == sumLeftHalf;
        } else {
            System.out.println("Invalid parameter! Number length should not exceed " + number_length + " characters");
            return false;
        }
    }

    private static int countSumOfCharacters(int number, int fromRegister, int toRegister) {
        int sum = 0;

        for (int register = 0; register < toRegister; register++) {
            if (register >= fromRegister && register < toRegister) {
                sum += number % 10;
            }
            number /= 10;
        }
        return sum;
    }
}
