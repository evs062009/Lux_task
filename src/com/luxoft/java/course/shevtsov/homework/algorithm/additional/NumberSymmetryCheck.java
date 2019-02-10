package com.luxoft.java.course.shevtsov.homework.algorithm.additional;

public class NumberSymmetryCheck {
    private final static int NUMBER_HALF_LENGTH = 2;
    public final static int NUMBER_LENGTH = NUMBER_HALF_LENGTH * 2;
    private static int number1 = 0;

    public static boolean checkNumberSymmetry(int number){
        number1 = Math.abs(number);
        String strNumber = "" + number1;

        if (strNumber.length() <= NUMBER_LENGTH){
            int sumRightHalf = countSumOfHalfCharacters();
            int sumLeftHalf = countSumOfHalfCharacters();
            return sumRightHalf == sumLeftHalf;
        } else {
            System.out.println("Invalid parameter! Number length should not exceed " + NUMBER_LENGTH + " characters");
            return false;
        }
    }

    private static int countSumOfHalfCharacters(){
        int sum = 0;

        for (int i = 0; i < NUMBER_HALF_LENGTH; i++) {
            sum += number1 % 10;
            number1 /= 10;
        }
        return sum;
    }
}
