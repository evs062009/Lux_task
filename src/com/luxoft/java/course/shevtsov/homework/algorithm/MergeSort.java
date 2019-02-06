package com.luxoft.java.course.shevtsov.homework.algorithm;

import java.util.Arrays;

public class MergeSort {
    private static int number = 0;

    public static int [] sort(int [] ints){
        int [] ints1 = Arrays.copyOfRange(ints, 0, ints.length / 2);
        int [] ints2 = Arrays.copyOfRange(ints, ints1.length, ints.length);
        return doSort(ints1, ints2);
    }

    private static int [] doSort(int [] ints1, int [] ints2){
        int [] resultInts = new int [ints1.length + ints2.length];

        if (ints1.length > 1) {
            int [] intsA = Arrays.copyOfRange(ints1, 0, ints1.length / 2);
            int [] intsB = Arrays.copyOfRange(ints1, intsA.length, ints1.length);
            ints1 = doSort(intsA, intsB);
        }

        if (ints2.length > 1){
            int [] intsA = Arrays.copyOfRange(ints2, 0, ints2.length / 2);
            int [] intsB = Arrays.copyOfRange(ints2, intsA.length, ints2.length);
            ints2 = doSort(intsA, intsB);
        }

        for (int resultIntsIndex = 0, ints1Index = 0, ints2Index = 0; resultIntsIndex < resultInts.length;
             resultIntsIndex++) {

            if (ints1Index == ints1.length){
                for (int j = resultIntsIndex; j < resultInts.length; j++, ints2Index++) {
                    resultInts[j] = ints2[ints2Index];
                }
                break;
            }

            if (ints2Index == ints2.length){
                for (int j = resultIntsIndex; j < resultInts.length; j++, ints1Index++) {
                    resultInts[j] = ints1[ints1Index];
                }
                break;
            }

            if (ints1[ints1Index] < ints2[ints2Index]){
                resultInts[resultIntsIndex] = ints1[ints1Index];
                ints1Index++;
            } else {
                resultInts[resultIntsIndex] = ints2[ints2Index];
                ints2Index++;
            }
        }

        //
        System.out.println("stage-" + (++number) + ": ints1 " + Arrays.toString(ints1) + ", ints2 "
                + Arrays.toString(ints2) + ", res " + Arrays.toString(resultInts));
        //

        return resultInts;
    }
}
