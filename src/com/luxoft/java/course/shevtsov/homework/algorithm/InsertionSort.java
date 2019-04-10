package com.luxoft.java.course.shevtsov.homework.algorithm;

import java.util.ArrayList;
import java.util.List;

class InsertionSort {

    static List<Integer> sort(List<Integer> integers) {
        List<Integer> list = new ArrayList<>(integers);
        Integer element;

        for (int iterCount = 1; iterCount < list.size(); iterCount++) {
            element = list.get(iterCount);
            int arrIndex = iterCount;
            for ( ; (arrIndex > 0) && (list.get(arrIndex - 1) > element); arrIndex--) {
                list.set(arrIndex, list.get(arrIndex - 1));
            }
            list.set(arrIndex, element);
        }
        return list;
    }
}