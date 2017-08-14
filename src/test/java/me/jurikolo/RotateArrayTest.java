package me.jurikolo;

import org.junit.jupiter.api.Test;

public class RotateArrayTest {
    @Test
    public void empty() {
        int[] arr = new int[0];
        RotateArray.rotate(arr, 42);
    }

    @Test
    public void example() {
        int[] arr = new int[7];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;
        arr[6] = 7;
        RotateArray.rotate(arr, 3);
    }

    @Test
    public void twoOne() {
        int[] arr = new int[2];
        arr[0] = 1;
        arr[1] = 2;
        RotateArray.rotate(arr, 1);
    }
}
