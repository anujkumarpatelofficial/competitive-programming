package com.anujkumarpatelofficial.algo.searching;

public class LinearSearch {

    public int search(int[] args, int value) {
        for (int j = 0; j < args.length; j++) {
            if (args[j] == value) return j+1;
        }
        return -1;
    }
}
