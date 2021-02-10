package me.jurikolo;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeTest {

    @Test
    public void zero() {
        Assert.assertTrue(new Palindrome().isPalindrome(0));
    }

    @Test
    public void singleDigit() {
        Assert.assertTrue(new Palindrome().isPalindrome(1));
        Assert.assertTrue(new Palindrome().isPalindrome(8));
    }

    @Test
    public void twoDigits() {
        Assert.assertTrue(new Palindrome().isPalindrome(66));
        Assert.assertFalse(new Palindrome().isPalindrome(67));
    }

    @Test
    public void threeDigits() {
        Assert.assertTrue(new Palindrome().isPalindrome(666));
        Assert.assertTrue(new Palindrome().isPalindrome(343));
        Assert.assertFalse(new Palindrome().isPalindrome(162));
    }
}
