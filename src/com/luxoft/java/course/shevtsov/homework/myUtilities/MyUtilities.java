package com.luxoft.java.course.shevtsov.homework.myUtilities;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MyUtilities {
    private static Scanner sc = new Scanner(System.in);

    public static int inputInt() {
        while (true) {
            if (sc.hasNextInt()){
                return sc.nextInt();
            } else {
                System.out.print("Invalid input. Please repeat: ");
            }
        }
    }

    public static ArrayList<Integer> inputIntegers() {
        ArrayList<Integer> integers = new ArrayList<Integer>();

        System.out.println("Input integer numbers. For complete input 'exit': ");
        while (true) {
            String input = sc.nextLine();
            if (input.equals("exit")){
                break;
            }
            try {
                integers.add(Integer.parseInt(input));
            } catch (NumberFormatException numFormEx) {
                System.out.print("Invalid input. Please repeat: ");
            }
        }
        return integers;
    }

    public static boolean isArrSotredByAsc(@NotNull int[] ints) {
        for (int arrIndex = 0; arrIndex < ints.length - 1; arrIndex++) {
            if (ints[arrIndex] > ints[arrIndex + 1]) {
                return false;
            }
        }
        return true;
    }
}