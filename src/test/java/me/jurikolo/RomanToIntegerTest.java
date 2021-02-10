package me.jurikolo;

import org.junit.Assert;
import org.junit.Test;

public class RomanToIntegerTest {

    @Test
    public void zero() {
        Assert.assertEquals(0, new RomanToInteger().romanToInt(""));
    }

    @Test
    public void one() {
        Assert.assertEquals(1, new RomanToInteger().romanToInt("I"));
    }

    @Test
    public void eighty() {
        Assert.assertEquals(80, new RomanToInteger().romanToInt("LXXX"));
    }

    @Test
    public void threeK() {
        Assert.assertEquals(3000, new RomanToInteger().romanToInt("MMM"));
    }

    @Test
    public void max() {
        Assert.assertEquals(3999, new RomanToInteger().romanToInt("MMMCMXCIX"));
    }
}
