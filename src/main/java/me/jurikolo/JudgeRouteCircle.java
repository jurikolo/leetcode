package me.jurikolo;

/*
 * https://leetcode.com/problems/judge-route-circle/description
 * Initially, there is a Robot at position (0, 0).
 * Given a sequence of its moves, judge if this robot makes a circle, which means it moves back to the original place.
 *
 * The move sequence is represented by a string.
 * And each move is represent by a character.
 * The valid robot moves are R (Right), L (Left), U (Up) and D (down).
 * The output should be true or false representing whether the robot makes a circle.
 */

public class JudgeRouteCircle {
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for(int cnt = 0; cnt < moves.length(); cnt++) {
            switch (moves.charAt(cnt)) {
                case 'R': x++; break;
                case 'L': x--; break;
                case 'U': y++; break;
                case 'D': y--; break;
                default: break;
            }
        }
        if((x != 0) || (y != 0)) {
            return false;
        }
        return true;
    }
}
