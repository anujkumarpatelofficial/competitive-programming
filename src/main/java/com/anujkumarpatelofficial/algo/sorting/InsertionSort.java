package com.anujkumarpatelofficial.algo.sorting;

public class InsertionSort {

    public int[] sort(int[] data) {
        if (data.length == 1) {
            return data;
        }
        for (int i = 1; i < data.length; i++) {
            int temp = i;
            int value = data[i];
            while (temp > 0 && data[temp - 1] > data[i]) {
                data[temp] = data[temp - 1];
                temp--;
            }
            data[temp] = value;
        }
        return data;
    }


}
