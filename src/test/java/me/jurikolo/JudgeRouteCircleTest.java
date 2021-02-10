package me.jurikolo;

import org.junit.Assert;
import org.junit.Test;

public class JudgeRouteCircleTest {
    @Test
    public void noAction() {
        Assert.assertTrue(new JudgeRouteCircle().judgeCircle(""));
    }

    @Test
    public void circle() {
        Assert.assertTrue(new JudgeRouteCircle().judgeCircle("UD"));
        Assert.assertTrue(new JudgeRouteCircle().judgeCircle("UDUDUUUDDD"));
        Assert.assertTrue(new JudgeRouteCircle().judgeCircle("ULRLLDRR"));
    }

    @Test
    public void noCircle() {
        Assert.assertFalse(new JudgeRouteCircle().judgeCircle("D"));
        Assert.assertFalse(new JudgeRouteCircle().judgeCircle("R"));
        Assert.assertFalse(new JudgeRouteCircle().judgeCircle("LLLRDDL"));
        Assert.assertFalse(new JudgeRouteCircle().judgeCircle("UDUDUUUDD"));
    }
}
