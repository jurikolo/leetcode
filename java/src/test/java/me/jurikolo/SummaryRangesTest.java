package me.jurikolo;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SummaryRangesTest {
    @Test
    public void zero() {
        int[] array = new int[0];
        Assert.assertEquals(new ArrayList<>(), new SummaryRanges().summaryRanges(array));
    }

    @Test
    public void one() {
        int[] array = new int[1];
        array[0] = 1;
        List<String> list = new ArrayList<>();
        list.add("1");
        Assert.assertEquals(list, new SummaryRanges().summaryRanges(array));
    }

    @Test
    public void six() {
        int[] array = new int[6];
        array[0] = 0;
        array[1] = 1;
        array[2] = 2;
        array[3] = 4;
        array[4] = 5;
        array[5] = 7;

        List<String> list = new ArrayList<>();
        list.add("0->2");
        list.add("4->5");
        list.add("7");
        Assert.assertEquals(list, new SummaryRanges().summaryRanges(array));
    }

    @Test
    public void seven() {
        int[] array = new int[7];
        array[0] = 0;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 6;
        array[5] = 8;
        array[6] = 9;

        List<String> list = new ArrayList<>();
        list.add("0");
        list.add("2->4");
        list.add("6");
        list.add("8->9");
        Assert.assertEquals(list, new SummaryRanges().summaryRanges(array));
    }
}
