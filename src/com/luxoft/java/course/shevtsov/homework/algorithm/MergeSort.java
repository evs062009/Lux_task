package com.luxoft.java.course.shevtsov.homework.algorithm;

import java.util.ArrayList;
import java.util.List;

class MergeSort {

    static List<Integer> sort(List<Integer> integers) {
        if (integers.size() > 1) {
            List<Integer> integers1 = new ArrayList<>(integers.subList(0, integers.size() / 2));
            List<Integer> integers2 = new ArrayList<>(integers.subList(integers1.size(), integers.size()));
            return getSortedArr(integers1, integers2);
        }
        return integers;
    }

    private static List<Integer> getSortedArr(List<Integer> integers1, List<Integer> integers2) {
        List<Integer> result = new ArrayList<>(integers1.size() + integers2.size());
        integers1 = sort(integers1);
        integers2 = sort(integers2);
        int ints1Index = 0;
        int ints2Index = 0;

        while (result.size() < integers1.size() + integers2.size()) {
            if (ints1Index == integers1.size()) {
                result.addAll(integers2.subList(ints2Index, integers2.size()));
                break;
            }
            if (ints2Index == integers2.size()) {
                result.addAll(integers1.subList(ints1Index, integers1.size()));
                break;
            }

            if (integers1.get(ints1Index) < integers2.get(ints2Index)) {
                result.add(integers1.get(ints1Index));
                ints1Index++;
            } else {
                result.add(integers2.get(ints2Index));
                ints2Index++;
            }
        }
        return result;
    }
}
