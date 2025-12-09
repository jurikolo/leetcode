package me.jurikolo;

/*
 * https://leetcode.com/problems/count-and-say/description
 * The count-and-say sequence is the sequence of integers with the first five terms as following:
 * 1. 1
 * 2. 11
 * 3. 21
 * 4. 1211
 * 5. 111221
 *
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2", then "one 1" or 1211.
 *
 * Given an integer n, generate the nth term of the count-and-say sequence.
 * Note: Each term of the sequence of integers will be represented as a string.
 */

public class CountAndSay {
    public String countAndSay(int n) {
        String result = "1";
        String tmpStr;
        boolean iterate;
        String currentChar;
        while(n > 1) {
            tmpStr = result;
            result = "";
            iterate = true;
            while(iterate) {
                int cnt = 1;
                currentChar = tmpStr.substring(0, 1);
                while ((cnt < tmpStr.length()) && (tmpStr.substring(cnt, cnt + 1).equalsIgnoreCase(currentChar))) {
                    cnt++;
                }
                result += String.valueOf(cnt);
                result += currentChar;
                if(tmpStr.length() > cnt) {
                    tmpStr = tmpStr.substring(cnt);
                } else {
                    iterate = false;
                }
            }
            n--;
        }
        return result;
    }
}
