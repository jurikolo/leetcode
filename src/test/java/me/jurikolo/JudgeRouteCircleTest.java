package me.jurikolo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JudgeRouteCircleTest {
    @Test
    public void noAction() {
        Assertions.assertTrue(new JudgeRouteCircle().judgeCircle(""));
    }

    @Test
    public void circle() {
        Assertions.assertTrue(new JudgeRouteCircle().judgeCircle("UD"));
        Assertions.assertTrue(new JudgeRouteCircle().judgeCircle("UDUDUUUDDD"));
        Assertions.assertTrue(new JudgeRouteCircle().judgeCircle("ULRLLDRR"));
    }

    @Test
    public void noCircle() {
        Assertions.assertFalse(new JudgeRouteCircle().judgeCircle("D"));
        Assertions.assertFalse(new JudgeRouteCircle().judgeCircle("R"));
        Assertions.assertFalse(new JudgeRouteCircle().judgeCircle("LLLRDDL"));
        Assertions.assertFalse(new JudgeRouteCircle().judgeCircle("UDUDUUUDD"));
    }
}
