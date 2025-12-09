package me.jurikolo;

/*
 * https://leetcode.com/problems/reverse-integer/description
 * Reverse digits of an integer.
 *
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 *
 * The input is assumed to be a 32-bit signed integer. Your function should return 0 when the reversed integer overflows.
 */

public class ReverseInteger {
    public static int reverse(int x) {
        String xString = Integer.toString(x);
        String reverseXString = reverseString(xString);

        //remove zeros from beginning
        while (reverseXString.startsWith("0")) {
            reverseXString = reverseXString.substring(1);
        }

        //move minus at first place
        if (reverseXString.endsWith("-")) {
            reverseXString = "-".concat(reverseXString.substring(0, reverseXString.length() - 1));
        }
        int result = 0;
        try {
            result = Integer.valueOf(reverseXString);
        } catch (NumberFormatException e) {
            System.out.println("Reverse value is not an Integer or it was zero");
        }
        return result;
    }

    public static String reverseString(String source) {
        String reverseString = "";
        for(int cnt = source.length() - 1; cnt >= 0; cnt--) {
            reverseString += source.charAt(cnt);
        }
        return reverseString;
    }
}
