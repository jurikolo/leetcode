package me.jurikolo;

/*
 * https://leetcode.com/problems/two-sum/description
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int num1;
        int num2;
        int cnt1 = 0;
        int cnt2 = 0;
        while ((cnt1 < nums.length - 1)) {
            num1 = nums[cnt1];
            cnt2 = 1;
            while ((cnt2 < nums.length)) {
                if(cnt1 == cnt2) {
                    cnt2++;
                } else {
                    num2 = nums[cnt2];
                    if (num1 + num2 == target) {
                        result[0] = num1;
                        result[1] = num2;
                        return result;
                    }
                    cnt2++;
                }

            }
            cnt1++;
        }
        System.out.println("None two values sum equals target");
        return result;
    }
}