package com.luxoft.java.course.shevtsov.homework.algorithm;

import com.luxoft.java.course.shevtsov.homework.algorithm.additional.NumberSymmetryCheck;
import com.luxoft.java.course.shevtsov.homework.myUtilities.MyUtilities;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        int number = MyUtilities.inputInt();
//        System.out.println(NumberSymmetryCheck.checkNumberSymmetry(number));
        ArrayList<Integer> numbers = MyUtilities.inputIntegers();
        numbers.forEach(number -> System.out.println("for " + number + " - "
                + NumberSymmetryCheck.checkNumberSymmetry(number)));
    }
}
