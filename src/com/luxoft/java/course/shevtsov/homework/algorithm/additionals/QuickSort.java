package com.luxoft.java.course.shevtsov.homework.algorithm.additionals;

import java.util.Arrays;

public class QuickSort {

    //
//    private static int n = 0;
    //

    public static int[] sort(int[] ints) {
        int[] ints1 = Arrays.copyOf(ints, ints.length);
        recursSort(ints1, 0, ints1.length - 1);
        return ints1;
    }

    private static void recursSort(int[] ints, int firstIndex, int pivot) {

        //
//        System.out.println("--------------------------------------------------------------");
//        System.out.println("stage " + (++n));
//        System.out.println("firstIndex - " + firstIndex);
//        System.out.println("pivot - " + pivot);
//        System.out.print("input arr");
//        printArr(ints, firstIndex, pivot);
        //

        if (firstIndex >= 0 && pivot < ints.length && firstIndex < pivot) {
            int wallIndex = firstIndex;

            while (wallIndex < pivot && ints[wallIndex] <= ints[pivot]) {
                wallIndex++;

                //
//                System.out.println("shift wall element to " + ints[wallIndex]);
                //

            }

            //
//            System.out.println("wall element: " + ints[wallIndex]);
            //

            for (int currentIndex = wallIndex; currentIndex < pivot; currentIndex++) {

                //
//                System.out.print("current element: " + ints[currentIndex]);
                //

                if (ints[currentIndex] <= ints[pivot]) {

                    //
//                    System.out.println(" <= pivot " + ints[pivot] + ", " + ints[currentIndex] + " <=> " + ints[wallIndex]);
                    //

                    int temp = ints[currentIndex];
                    ints[currentIndex] = ints[wallIndex];
                    ints[wallIndex] = temp;
                    wallIndex++;

                    //
//                    System.out.println("wall element " + ints[wallIndex]);
//                    System.out.print("arr after wall <=> current: ");
//                    printArr(ints, firstIndex, pivot);
                    //

                }

                //
//                else {
//                    System.out.println(" skip");
//                }
                //

            }

            //
//            System.out.print("pivot " + ints[pivot] + " =>  wall" + ints[wallIndex] + ": ");
            //

            int pivotElement = ints[pivot];
            for (int i = pivot; i > wallIndex; i--) {
                ints[i] = ints[i - 1];
            }
            ints[wallIndex] = pivotElement;

            //
//            printArr(ints, firstIndex, pivot);
//            System.out.print("whole arr: ");
//            printArr(ints, 0, ints.length - 1);
            //

            recursSort(ints, firstIndex, wallIndex - 1);
            recursSort(ints, wallIndex + 1, pivot);
        }

        //
//        System.out.print("output arr");
//        printArr(ints, firstIndex, pivot);
        //
    }

    //!!! for testing, delete
//    private static void printArr(int[] ints, int from, int to) {
//        System.out.print("[");
//        for (int i = from; i <= to; i++) {
//            System.out.print(ints[i] + ", ");
//        }
//        System.out.println("]");
//    }
    //
}
