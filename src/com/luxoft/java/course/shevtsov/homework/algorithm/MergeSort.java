package com.luxoft.java.course.shevtsov.homework.algorithm;

import java.util.Arrays;

public class MergeSort {

    public static int[] sort(int[] ints) {
        if (ints.length > 1) {
            int[] ints1 = Arrays.copyOfRange(ints, 0, ints.length / 2);
            int[] ints2 = Arrays.copyOfRange(ints, ints1.length, ints.length);
            return getSortedArr(ints1, ints2);
        }
        return ints;
    }

    private static int[] getSortedArr(int[] ints1, int[] ints2) {
        int[] result = new int[ints1.length + ints2.length];
        ints1 = sort(ints1);
        ints2 = sort(ints2);

        for (int resultIndex = 0, ints1Index = 0, ints2Index = 0; resultIndex < result.length; resultIndex++) {
            if (ints1Index == ints1.length) {
                fillRest(result, resultIndex, ints2, ints2Index);
                break;
            }
            if (ints2Index == ints2.length) {
                fillRest(result, resultIndex, ints1, ints1Index);
                break;
            }

            if (ints1[ints1Index] < ints2[ints2Index]) {
                result[resultIndex] = ints1[ints1Index];
                ints1Index++;
            } else {
                result[resultIndex] = ints2[ints2Index];
                ints2Index++;
            }
        }
        return result;
    }

    private static void fillRest(int[] destInts, int destFrom, int[] sourceInts, int sourceFrom) {
        int destIndex = destFrom;
        int sourceIndex = sourceFrom;
        for (; destIndex < destInts.length; destIndex++, sourceIndex++) {
            destInts[destIndex] = sourceInts[sourceIndex];
        }
    }
}
