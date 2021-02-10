package me.jurikolo;

import org.junit.Assert;
import org.junit.Test;

public class ReverseIntegerTest {

    @Test
    public void zero() {
        int x = ReverseInteger.reverse(0);
        Assert.assertEquals(0, x);
    }

    @Test
    public void maxInt() {
        int x = ReverseInteger.reverse(Integer.MAX_VALUE);
        Assert.assertEquals(0, x);
    }

    @Test
    public void maxIntPlus1() {
        int x = ReverseInteger.reverse(Integer.MAX_VALUE + 1);
        Assert.assertEquals(0, x);
    }

    @Test
    public void minus100() {
        int x = ReverseInteger.reverse(-100);
        Assert.assertEquals(-1, x);
    }


}
