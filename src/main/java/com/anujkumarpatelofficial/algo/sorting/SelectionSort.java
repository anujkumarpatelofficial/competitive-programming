package com.anujkumarpatelofficial.algo.sorting;

public class SelectionSort {

    public int[] sort(int[] data) {

        for (int i = 0; i < data.length - 1; i++) {
            int value = data[i];
            int temp = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < value) {
                    temp = j;
                    value = data[j];
                }
            }
            data[temp] = data[i];
            data[i] = value;
        }
        return data;
    }

}
