package me.jurikolo;

import org.junit.Assert;
import org.junit.Test;

public class CountAndSayTest {
    @Test
    public void one() {
        Assert.assertEquals("1", new CountAndSay().countAndSay(1));
    }

    @Test
    public void two() {
        Assert.assertEquals("11", new CountAndSay().countAndSay(2));
    }

    @Test
    public void three() {
        Assert.assertEquals("21", new CountAndSay().countAndSay(3));
    }

    @Test
    public void four() {
        Assert.assertEquals("1211", new CountAndSay().countAndSay(4));
    }

    @Test
    public void five() {
        Assert.assertEquals("111221", new CountAndSay().countAndSay(5));
    }

    @Test
    public void six() {
        Assert.assertEquals("312211", new CountAndSay().countAndSay(6));
    }
}
