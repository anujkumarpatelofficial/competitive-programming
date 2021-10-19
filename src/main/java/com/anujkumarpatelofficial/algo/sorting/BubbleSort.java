package com.anujkumarpatelofficial.algo.sorting;

public class BubbleSort {

    public int[] sort(int[] data) {
        if (data.length <= 1) {
            return data;
        }
        int temp;
        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] > data[j]) {
                    temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
        return data;
    }

    public int[] recursiveSort(int data[], int first) {
        if (first == data.length-1) {
            return data;
        } else {
            int temp;
            for (int j = first + 1; j < data.length; j++) {
                if (data[first] > data[j]) {
                    temp = data[first];
                    data[first] = data[j];
                    data[j] = temp;
                }
            }
        }
        return recursiveSort(data, first + 1);
    }

}
