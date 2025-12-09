package me.jurikolo;

import org.junit.Test;

public class MergeSortedArrayTest {

    @Test
    public void empty() {
        int[] nums1 = new int[0];
        int[] nums2 = new int[0];
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        mergeSortedArray.merge(nums1, 0, nums2, 0);
    }

    @Test
    public void firstArrayIsEmpty() {
        int[] nums1 = new int[2];
        int[] nums2 = new int[2];
        nums2[0] = 1;
        nums2[1] = 2;
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        mergeSortedArray.merge(nums1, 0, nums2, 2);
    }

    @Test
    public void secondArrayIsEmpty() {
        int[] nums1 = new int[2];
        int[] nums2 = new int[0];
        nums1[0] = 1;
        nums1[1] = 2;
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        mergeSortedArray.merge(nums1, 2, nums2, 0);
    }

    @Test
    public void firstThenSecond() {
        int[] nums1 = new int[6];
        int[] nums2 = new int[3];
        nums1[0] = 1;
        nums1[1] = 2;
        nums1[2] = 3;
        nums2[0] = 4;
        nums2[1] = 5;
        nums2[2] = 6;
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        mergeSortedArray.merge(nums1, 3, nums2, 3);
    }
}
