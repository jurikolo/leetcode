package me.jurikolo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSumTest {

    @Test
    public void testFirstTwo() {
        int[] result = new int[2];
        int[] testArray = new int[4];
        testArray[0] = 2;
        testArray[1] = 7;
        testArray[2] = 11;
        testArray[3] = 15;
        result = TwoSum.twoSum(testArray, 9);
        Assertions.assertEquals(result[0], 0);
        Assertions.assertEquals(result[1], 1);
    }

    @Test
    public void testLastTwo() {
        int[] result = new int[2];
        int[] testArray = new int[4];
        testArray[0] = 2;
        testArray[1] = 7;
        testArray[2] = 11;
        testArray[3] = 15;
        result = TwoSum.twoSum(testArray, 26);
        Assertions.assertEquals(result[0], 2);
        Assertions.assertEquals(result[1], 3);
    }

    @Test
    public void testFirstLast() {
        int[] result = new int[2];
        int[] testArray = new int[4];
        testArray[0] = 2;
        testArray[1] = 7;
        testArray[2] = 11;
        testArray[3] = 15;
        result = TwoSum.twoSum(testArray, 17);
        Assertions.assertEquals(result[0], 0);
        Assertions.assertEquals(result[1], 3);
    }

    @Test
    public void invalidTarget() {
        int[] result = new int[2];
        int[] testArray = new int[4];
        testArray[0] = 2;
        testArray[1] = 7;
        testArray[2] = 11;
        testArray[3] = 15;
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            TwoSum.twoSum(testArray, 100500);
        });
    }
}
