package me.jurikolo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestCommonPrefixTest {

    @Test
    public void zero() {
        String[] strs = new String[]{};
        Assertions.assertEquals("", LongestCommonPrefix.longestCommonPrefix(strs));

        String[] strs2 = new String[]{"a", "b", "c", "def"};
        Assertions.assertEquals("", LongestCommonPrefix.longestCommonPrefix(strs2));
    }

    @Test
    public void five() {
        String[] strs = new String[]{"abcdef", "abcdef", "abcdet", "abcde"};
        Assertions.assertEquals("abcde", LongestCommonPrefix.longestCommonPrefix(strs));
    }

    @Test
    public void one() {
        String[] strs = new String[]{"a", "a"};
        Assertions.assertEquals("a", LongestCommonPrefix.longestCommonPrefix(strs));

        String[] strs2 = new String[]{"a", "ab", "abc"};
        Assertions.assertEquals("a", LongestCommonPrefix.longestCommonPrefix(strs2));
    }
}
