package com.luxoft.java.course.shevtsov.homework.algorithm;

import java.util.ArrayList;
import java.util.List;

class SelectionSort {

    static List<Integer> sort(List<Integer> integers) {
        List<Integer> list = new ArrayList<>(integers);
        for (int i = 0; i < list.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) < list.get(minIndex)) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                AlgoUtilities.swap(list, i, minIndex);
            }
        }
        return list;
    }
}
