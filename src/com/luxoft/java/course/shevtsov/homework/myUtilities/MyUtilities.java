package com.luxoft.java.course.shevtsov.homework.myUtilities;

import java.util.Scanner;

public class MyUtilities {
    private static Scanner sc = new Scanner(System.in);

    public static int inputInt() {

        while (true) {
            String input = sc.nextLine();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException numFormEx) {
                System.out.print("Invalid input. Please repeat: ");
            }
        }
    }

    public static boolean isArrSotredByAsc(int[] ints) {
        for (int arrIndex = 0; arrIndex < ints.length - 1; arrIndex++) {
            if (ints[arrIndex] > ints[arrIndex + 1]) {
                return false;
            }
        }
        return true;
    }
}