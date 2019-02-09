package com.luxoft.java.course.shevtsov.homework.algorithm;

import com.luxoft.java.course.shevtsov.homework.algorithm.additional.NumberSymmetryCheck;
import com.luxoft.java.course.shevtsov.homework.myUtilities.MyUtilities;

public class Main {

    public static void main(String[] args) {
        int number = 0;
        while (true) {
            System.out.print("Input int number (should not exceed " + NumberSymmetryCheck.NUMBER_LENGTH
                    + " characters). ");
            System.out.print("For exit input '0': ");
            number = MyUtilities.inputInt();
            if (number != 0){
                System.out.println(NumberSymmetryCheck.checkNumberSymmetry(number));
            } else {
                break;
            }
        }
    }
}
