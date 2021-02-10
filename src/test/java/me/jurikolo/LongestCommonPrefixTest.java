package me.jurikolo;

import org.junit.Assert;
import org.junit.Test;

public class LongestCommonPrefixTest {

    @Test
    public void zero() {
        String[] strs = new String[]{};
        Assert.assertEquals("", LongestCommonPrefix.longestCommonPrefix(strs));

        String[] strs2 = new String[]{"a", "b", "c", "def"};
        Assert.assertEquals("", LongestCommonPrefix.longestCommonPrefix(strs2));
    }

    @Test
    public void five() {
        String[] strs = new String[]{"abcdef", "abcdef", "abcdet", "abcde"};
        Assert.assertEquals("abcde", LongestCommonPrefix.longestCommonPrefix(strs));
    }

    @Test
    public void one() {
        String[] strs = new String[]{"a", "a"};
        Assert.assertEquals("a", LongestCommonPrefix.longestCommonPrefix(strs));

        String[] strs2 = new String[]{"a", "ab", "abc"};
        Assert.assertEquals("a", LongestCommonPrefix.longestCommonPrefix(strs2));
    }
}
