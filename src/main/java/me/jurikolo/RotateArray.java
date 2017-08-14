package me.jurikolo;

/*
 * https://leetcode.com/problems/rotate-array/description
 * Rotate an array of n elements to the right by k steps.
 *
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 */

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        System.out.print("Initial array: ");
        for(int cnt = 0; cnt < nums.length; cnt++) {
            System.out.print(nums[cnt] + " ");
        }
        if(nums.length < 1) {
            return;
        }

        for(; k > 0; k--) {
            int[] tmp = new int[nums.length];
            tmp[0] = nums[nums.length - 1];
            for(int cnt = 1; cnt < nums.length; cnt++) {
                tmp[cnt] = nums[cnt - 1];
            }
            nums = tmp;
        }
        System.out.println();
        System.out.print("Final array: ");
        for(int cnt = 0; cnt < nums.length; cnt++) {
            System.out.print(nums[cnt] + " ");
        }
    }
}
