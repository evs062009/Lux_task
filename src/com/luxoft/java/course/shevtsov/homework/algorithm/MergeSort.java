package com.luxoft.java.course.shevtsov.homework.algorithm;

import java.util.Arrays;

public class MergeSort {
    private static int number = 0;

//    public static int [] sort(int [] ints){
//        int [] newInts = Arrays.copyOf(ints, ints.length);
//
//        return newInts;
//    }

    public static void split(int [] arr){
        int [] arr1 = {};
        int [] arr2 = {};
        if (arr.length > 1) {
            arr1 = Arrays.copyOfRange(arr, 0, arr.length / 2);
            arr2 = Arrays.copyOfRange(arr, arr1.length, arr.length);
            split(arr1);
            split(arr2);
        }
        int [] rezArr = new int [arr1.length + arr2.length];
        for (int i = 0, arr1Index = 0, arr2Index = 0; i < rezArr.length; i++) {

            if (arr1Index == arr1.length){
                for (int j = i; j < rezArr.length; j++, arr2Index++) {
                    rezArr[i] = arr2[arr2Index];
                }
            }

            if (arr2Index == arr2.length){
                for (int j = i; j < rezArr.length; j++, arr1Index++) {
                    rezArr[i] = arr1[arr1Index];
                }
            }

            if (arr1[arr1Index] < arr2[arr2Index]){
                rezArr[i] = arr1[arr1Index];
                arr1Index++;
            } else {
                rezArr[i] = arr2[arr2Index];
                arr2Index++;
            }
        }
        System.out.println("array" + (++number) + " - " + Arrays.toString(rezArr));
    }
}
