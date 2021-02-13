package me.jurikolo;

/*
 * https://leetcode.com/problems/merge-sorted-array/
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 * You may assume that nums1 has a size equal to m + n such that it has enough space to hold additional elements from nums2.
 */

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int cnt = m + n - 1;
        while(m!= 0 && n!= 0) {
            if (nums1[m - 1] > nums2[n - 1]) {
                nums1[cnt] = nums1[m - 1];
                m--;
            } else {
                nums1[cnt] = nums2[n - 1];
                n--;
            }
            cnt--;
        }
        if (n > 0) {
            for(;cnt >= 0; cnt--) {
                nums1[cnt] = nums2[cnt];
            }
        }
    }
}
