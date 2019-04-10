package com.luxoft.java.course.shevtsov.homework.algorithm;

import java.util.ArrayList;
import java.util.List;

class BubbleSort {

    static List<Integer> sort(List<Integer> integers) {
        List<Integer> list = new ArrayList<>(integers);
        boolean noSwap;

        for (int iterCount = list.size() - 1; iterCount > 0; iterCount--) {
            noSwap = true;
            for (int arrIndex = 0; arrIndex < iterCount; arrIndex++) {
                if (list.get(arrIndex) > list.get(arrIndex + 1)){
                    AlgoUtilities.swap(list, arrIndex, arrIndex + 1);
                    noSwap = false;
                }
            }
            if (noSwap){
                break;
            }
        }
        return list;
    }
}
