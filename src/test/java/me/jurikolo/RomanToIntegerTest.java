package me.jurikolo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanToIntegerTest {

    @Test
    public void zero() {
        Assertions.assertEquals(0, new RomanToInteger().romanToInt(""));
    }

    @Test
    public void one() {
        Assertions.assertEquals(1, new RomanToInteger().romanToInt("I"));
    }

    @Test
    public void eighty() {
        Assertions.assertEquals(80, new RomanToInteger().romanToInt("LXXX"));
    }

    @Test
    public void threeK() {
        Assertions.assertEquals(3000, new RomanToInteger().romanToInt("MMM"));
    }

    @Test
    public void max() {
        Assertions.assertEquals(3999, new RomanToInteger().romanToInt("MMMCMXCIX"));
    }
}
