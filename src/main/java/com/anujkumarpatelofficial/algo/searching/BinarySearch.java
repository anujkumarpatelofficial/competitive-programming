package com.anujkumarpatelofficial.algo.searching;

public class BinarySearch {

    public int iterative(int[] data, int value) {
        int location = -1;
        int front = 0;
        int back = data.length - 1;

        while (front <= back) {
            int mid = (front + back) / 2;
            if (data[mid] == value) {
                location = mid;
                break;
            } else if (value > data[mid]) {
                front = mid + 1;
            } else if (value < data[mid]) {
                back = mid - 1;
            }
        }
        return location;
    }

    public int recursive(int data[], int front, int back, int value) {
        if (front > back) {
            return -1;
        }
        int mid = (front + back) / 2;
        if (value == data[mid]) {
            return mid;
        } else if (value < data[mid]) {
            return recursive(data, front, mid - 1, value);
        } else {
            return recursive(data, mid + 1, back, value);
        }

    }

}
