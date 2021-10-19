package com.anujkumarpatelofficial.algo.searching;

import org.junit.Assert;
import org.junit.Test;

public class LinearSearchTest {

    LinearSearch linearSearch = new LinearSearch();

    @Test
    public void test_happy() {
        int [] data = {10,80,30,20,55,22,90};
        int value = 22;
        Assert.assertEquals(6 , linearSearch.search(data, value));
    }

    @Test
    public void test_no_found() {
        int [] data = {10,80,30,20,55,22,90};
        int value = 12;
        Assert.assertEquals(-1 , linearSearch.search(data, 12));
    }
}
