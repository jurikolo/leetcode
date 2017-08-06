package me.jurikolo;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0].toString();
        }
        if (strs.length == 0) {
            return "";
        }
        String result = "";
        String potential = "";
        int length = 0;
        while (true) {
            length++;
            if (length <= strs[0].length()) {
                potential = strs[0].substring(0, length);
            } else {
                return result;
            }
            for (int cnt = 0; cnt < strs.length; cnt++) {
                if (length <= strs[cnt].length()) {
                    if (potential.compareTo(strs[cnt].substring(0, length)) == 0) {

                    } else {
                        return result;
                    }
                } else {
                    return result;
                }
            }
            result = potential;
        }
    }
}


// abc
// ab
// abcd