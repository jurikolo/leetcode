package me.jurikolo;

import org.junit.Assert;
import org.junit.Test;

import static me.jurikolo.HammingDistance.hammingDistance;

public class HammingDistanceTest {

    @Test
    public void zero() {
        Assert.assertEquals(0, hammingDistance(0, 0));
        Assert.assertEquals(0, hammingDistance(64, 64));
    }

    @Test
    public void one() {
        Assert.assertEquals(1, hammingDistance(0, 1));
        Assert.assertEquals(1, hammingDistance(3, 1));
    }

    @Test
    public void two() {
        Assert.assertEquals(2, hammingDistance(1, 4));
        Assert.assertEquals(2, hammingDistance(1, 4));
    }

}
