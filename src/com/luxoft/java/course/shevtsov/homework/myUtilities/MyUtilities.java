package com.luxoft.java.course.shevtsov.homework.myUtilities;

import java.util.Scanner;

public class MyUtilities {
    private static Scanner sc = new Scanner(System.in);

    public static int inputInt() {
        String input;

        while (true) {
            System.out.print("Input integer number: ");
            input = sc.nextLine();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException numFormEx) {
                System.out.println("Invalid input. Please repeat.");
            }
        }
    }

    public static boolean ifArrSotredByAsc(int[] ints) {
        for (int arrIndex = 0; arrIndex < ints.length - 1; arrIndex++) {
            if (ints[arrIndex] > ints[arrIndex + 1]) {
                return false;
            }
        }
        return true;
    }
}
