package com.anujkumarpatelofficial.algo.sorting;

import org.junit.Assert;
import org.junit.Test;

public class BubbleSortTest {

    BubbleSort bubbleSort = new BubbleSort();

    @Test
    public void test_happy() {
        int[] data = {2, 1, 5, 4, 8, 7, 9};
        int[] sortedData = {1, 2, 4, 5, 7, 8, 9};
        Assert.assertArrayEquals(sortedData, bubbleSort.sort(data));
    }

    @Test
    public void test_recursive() {
        int[] data = {2, 1, 5, 4, 8, 7, 9};
        int[] sortedData = {1, 2, 4, 5, 7, 8, 9};
        Assert.assertArrayEquals(sortedData, bubbleSort.recursiveSort(data, 0));
    }
}
