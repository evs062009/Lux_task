package com.luxoft.java.course.shevtsov.homework.algorithm.additionals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class QuickSort_NoRecursoin {

    public static int[] sort(int[] ints) {
        int[] ints1 = Arrays.copyOf(ints, ints.length);

        ArrayList<int[]> pairsOfCoordinates = new ArrayList<int[]>();
        addPairCoordinates(pairsOfCoordinates, 0, ints1.length - 1);

        for (int pairNumber = 0; pairNumber < pairsOfCoordinates.size(); pairNumber++) {

            //
//            System.out.println("------------------------------------------------");
//            System.out.println("iteration " + pairNumber);
            //

            int[] currentCoordinates = pairsOfCoordinates.get(pairNumber);

            //
//            System.out.println("start arr " + Arrays.toString(ints1));
//            System.out.println("sorting interval " + currentCoordinates[0] + "-" + currentCoordinates[1]);
            //

            int pivotIndex = doSort(ints1, currentCoordinates[0], currentCoordinates[1]);

            //
//            System.out.println("arr after satPivot" + Arrays.toString(ints1));
            //

            if (pivotIndex != -1) {
                addPairCoordinates(pairsOfCoordinates, currentCoordinates[0], pivotIndex - 1);

                //
//                System.out.println("add coordinates " + currentCoordinates[0] + "-" + (pivotIndex - 1));
                //

                addPairCoordinates(pairsOfCoordinates, pivotIndex + 1, currentCoordinates[1]);

                //
//                System.out.println("add coordinates " + (pivotIndex + 1) + "-" + currentCoordinates[1]);
                //

            }

            //
//            System.out.println("processed arr " + Arrays.toString(ints1));
            //

        }
        return ints1;
    }

    private static int doSort(int[] ints, int firstIndex, int lastIndex) {
        if (firstIndex >= 0 && lastIndex < ints.length && firstIndex < lastIndex) {
            int pivotIndex = lastIndex;
            int wallIndex = firstIndex;

            //
//            System.out.println("pivot el = " + ints[pivotIndex]);
            //

            while (wallIndex < lastIndex && ints[wallIndex] <= ints[pivotIndex]) {
                wallIndex++;

                //
//                System.out.println("shift wall el to " + ints[wallIndex]);
                //

            }

            for (int currentIndex = wallIndex; currentIndex < lastIndex; currentIndex++) {
                if (ints[currentIndex] <= ints[pivotIndex]) {

                    //
//                    System.out.println(ints[currentIndex] + "<->" + ints[wallIndex]);
                    //

                    QuickSort.swap(ints, currentIndex, wallIndex);
                    wallIndex++;

                    //
//                    System.out.println("shift wall el to" + ints[wallIndex]);
//                    System.out.println(Arrays.toString(ints));
                    //

                }

                //
//                else {
//                    System.out.println("skip " + ints[currentIndex]);
//                }
                //

            }

            //
//            System.out.println(ints[pivotIndex] + "<->" + ints[wallIndex]);
            //

            //
//            System.out.println("arr before satPivot " + Arrays.toString(ints));
            //

            return QuickSort.setPivotToPosition(ints, pivotIndex, wallIndex);

        }
        return -1;
    }

    private static void addPairCoordinates(ArrayList<int[]> coordinates, int firstCoordinate, int secondCoordinate) {
        int[] pair = {firstCoordinate, secondCoordinate};
        coordinates.add(pair);
    }
}