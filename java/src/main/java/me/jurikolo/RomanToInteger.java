package me.jurikolo;

/*
 * https://leetcode.com/problems/roman-to-integer/description
 * Given a roman numeral, convert it to an integer.
 *
 * Input is guaranteed to be within the range from 1 to 3999.
 */

public class RomanToInteger {
    public int romanToInt(String s) {
        int result = 0;
        for (int cnt = 0; cnt < s.length(); cnt++) {
            char c = s.charAt(cnt);
            switch(c) {
                case 'I':
                    result++;
                    break;
                case 'V':
                    result+=5;
                    break;
                case 'X':
                    result+=10;
                    break;
                case 'L':
                    result+=50;
                    break;
                case 'C':
                    result+=100;
                    break;
                case 'D':
                    result+=500;
                    break;
                case 'M':
                    result+=1000;
            }
        }
        if (s.contains("IV") || s.contains("IX") || s.contains("IL") || s.contains("IC") || s.contains("ID") || s.contains("IM")) result-=2;
        if (s.contains("VX") || s.contains("VL") || s.contains("VC") || s.contains("VD") || s.contains("VM")) result-=10;
        if (s.contains("XL") || s.contains("XC") || s.contains("XD") || s.contains("XM")) result-=20;
        if (s.contains("LC") || s.contains("LD") || s.contains("LM")) result-=100;
        if (s.contains("CD") || s.contains("CM")) result-=200;
        if (s.contains("DM")) result-=1000;

        return result;
    }
}
