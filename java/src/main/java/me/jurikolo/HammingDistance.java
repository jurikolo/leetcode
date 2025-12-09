package me.jurikolo;

/*
 * https://leetcode.com/problems/hamming-distance/description
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
 * 
 * Hamming distance: https://en.wikipedia.org/wiki/Hamming_distance
 *
 * Given two integers x and y, calculate the Hamming distance.
 * Note:
 * 0 ≤ x, y < 231.
 *
 */

public class HammingDistance {
    public static int hammingDistance(int x, int y) {
        if (x == y) {
            return 0;
        }
        int result = 0;
        String stringX = Integer.toBinaryString(x);
        String stringY = Integer.toBinaryString(y);
        if (stringX.length() > stringY.length()) {
            String tmp = "";
            for (int diff = 0; diff < stringX.length() - stringY.length(); diff++) tmp += "0";
            stringY = tmp + stringY;
        } else if (stringX.length() < stringY.length()) {
            String tmp = "";
            for (int diff = 0; diff < stringY.length() - stringX.length(); diff++) tmp += "0";
            stringX = tmp + stringX;
        }
        for(int cnt = stringY.length() - 1; cnt >= 0; cnt--) {
            if (stringX.charAt(cnt) != stringY.charAt(cnt)) {
                result++;
            }
        }
        return result;
    }
}
