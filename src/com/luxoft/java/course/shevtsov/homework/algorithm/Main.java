package com.luxoft.java.course.shevtsov.homework.algorithm;

import com.luxoft.java.course.shevtsov.homework.algorithm.additional.CheckEqualsSumsOfNumbers;
import com.luxoft.java.course.shevtsov.homework.myUtilities.MyUtilities;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = MyUtilities.inputIntegers();
        numbers.forEach(number -> System.out.println("for " + number + " - "
                + CheckEqualsSumsOfNumbers.checkEqualsSumsOfNumbers(number)));
    }
}
