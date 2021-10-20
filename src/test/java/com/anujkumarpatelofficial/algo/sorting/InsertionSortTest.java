package com.anujkumarpatelofficial.algo.sorting;

import org.junit.Assert;
import org.junit.Test;

public class InsertionSortTest {

    InsertionSort insertionSort = new InsertionSort();

    @Test
    public void test() {
        int[] data = {2, 1, 5, 4, 8, 7, 9};
        int[] sortedData = {1, 2, 4, 5, 7, 8, 9};
        Assert.assertArrayEquals(sortedData, insertionSort.sort(data));
    }
}
