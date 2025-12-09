package me.jurikolo;

import java.util.ArrayList;
import java.util.List;

/*
 * https://leetcode.com/problems/summary-ranges
 * You are given a sorted unique integer array nums.
 * Return the smallest sorted list of ranges that cover all the numbers in the array exactly.
 * That is, each element of nums is covered by exactly one of the ranges,
 * and there is no integer x such that x is in one of the ranges but not in nums.
 *
 * Input: nums = [0,1,2,4,5,7]
 * Output: ["0->2","4->5","7"]
 *
 * Input: nums = [0,2,3,4,6,8,9]
 * Output: ["0","2->4","6","8->9"]
 */

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        if (nums.length == 0) return new ArrayList<>();
        List<String> result = new ArrayList<>();
        int start = nums[0];
        int compareTo = start;
        if (nums.length == 1) {
            result.add(Integer.toString(nums[0]));
            return result;
        }
        for(int i = 1; i < nums.length; i++) {
            if (nums[i] == compareTo + 1) {
                compareTo++;
            } else {
                if (start == compareTo) {
                    result.add(Integer.toString(start));

                } else {
                    result.add(Integer.toString(start) + "->" + Integer.toString(compareTo));
                }
                if (i < nums.length) {
                    start = nums[i];
                    compareTo = nums[i];
                }
            }
        }
        if (start != compareTo) {
            result.add(Integer.toString(start) + "->" + Integer.toString(compareTo));
        } else {
            result.add(Integer.toString(compareTo));
        }
        return result;
    }
}
