package com.luxoft.java.course.shevtsov.homework.algorithm;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AlgoUtilities {
    private static Scanner sc = new Scanner(System.in);

    public static List<Integer> inputIntegers() {
        List<Integer> integers = new ArrayList<>();

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

    static List<Integer> fillIntegers(int size) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        return list;
    }

    static boolean isArrSotredByAsc(@NotNull int[] ints) {
        for (int arrIndex = 0; arrIndex < ints.length - 1; arrIndex++) {
            if (ints[arrIndex] > ints[arrIndex + 1]) {
                return false;
            }
        }
        return true;
    }

    static void swap(List<Integer> integers, int firstElement, int secondElement) {
        Integer temp = integers.get(secondElement);
        integers.set(secondElement, integers.get(firstElement));
        integers.set(firstElement, temp);
    }
}