package me.jurikolo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseIntegerTest {

    @Test
    public void zero() {
        int x = ReverseInteger.reverse(0);
        Assertions.assertEquals(0, x);
    }

    @Test
    public void maxInt() {
        int x = ReverseInteger.reverse(Integer.MAX_VALUE);
        Assertions.assertEquals(0, x);
    }

    @Test
    public void maxIntPlus1() {
        int x = ReverseInteger.reverse(Integer.MAX_VALUE + 1);
        Assertions.assertEquals(0, x);
    }

    @Test
    public void minus100() {
        int x = ReverseInteger.reverse(-100);
        Assertions.assertEquals(-1, x);
    }


}
