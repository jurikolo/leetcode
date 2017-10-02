package me.jurikolo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static me.jurikolo.HammingDistance.hammingDistance;

public class HammingDistanceTest {

    @Test
    public void zero() {
        Assertions.assertEquals(0, hammingDistance(0, 0));
        Assertions.assertEquals(0, hammingDistance(64, 64));
    }

    @Test
    public void one() {
        Assertions.assertEquals(1, hammingDistance(0, 1));
        Assertions.assertEquals(1, hammingDistance(3, 1));
    }

    @Test
    public void two() {
        Assertions.assertEquals(2, hammingDistance(1, 4));
        Assertions.assertEquals(2, hammingDistance(1, 4));
    }

}
