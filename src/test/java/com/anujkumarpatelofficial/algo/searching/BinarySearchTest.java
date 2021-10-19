package com.anujkumarpatelofficial.algo.searching;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {

    BinarySearch binarySearch = new BinarySearch();

    @Test
    public void test_iteration() {
        int data[] = {1, 4, 7, 9, 12, 24, 56, 60};
        Assert.assertEquals(4, binarySearch.iterative(data, 12));
    }

    @Test
    public void test_recursion() {
        int data[] = {1, 4, 7, 9, 12, 24, 56, 60};
        Assert.assertEquals(4, binarySearch.recursive(data,0, data.length-1, 12));
    }

}
