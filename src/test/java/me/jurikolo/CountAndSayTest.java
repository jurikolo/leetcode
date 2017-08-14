package me.jurikolo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountAndSayTest {
    @Test
    public void one() {
        Assertions.assertEquals("1", new CountAndSay().countAndSay(1));
    }

    @Test
    public void two() {
        Assertions.assertEquals("11", new CountAndSay().countAndSay(2));
    }

    @Test
    public void three() {
        Assertions.assertEquals("21", new CountAndSay().countAndSay(3));
    }

    @Test
    public void four() {
        Assertions.assertEquals("1211", new CountAndSay().countAndSay(4));
    }

    @Test
    public void five() {
        Assertions.assertEquals("111221", new CountAndSay().countAndSay(5));
    }

    @Test
    public void six() {
        Assertions.assertEquals("312211", new CountAndSay().countAndSay(6));
    }
}
