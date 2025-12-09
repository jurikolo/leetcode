package me.jurikolo;

/*
    https://leetcode.com/problems/palindrome-number/

    Given an integer x, return true if x is palindrome integer.
    An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.
*/

public class Palindrome {
    private boolean compareAndCut(String str) {
        if (str.length() > 2) {
            if (str.substring(0, 1).equals(str.substring(str.length() - 1))) {
                return compareAndCut(str.substring(1, str.length() - 1));
            }
            return false;
        } else if (str.length() == 2){
            if (str.charAt(0) == str.charAt(1)) {
                return true;
            } else {
                return false;
            }
        } else {
            return true;
        }
    }
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x < 10) return true;
        return compareAndCut(String.valueOf(x));
    }
}