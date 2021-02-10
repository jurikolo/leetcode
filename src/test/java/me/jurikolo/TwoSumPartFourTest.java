package me.jurikolo;

import me.jurikolo.extra.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TwoSumPartFourTest {
    @Test
    public void example() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(6);
        root.right.right = new TreeNode(7);
        Assert.assertTrue(new TwoSumPartFour().findTarget(root, 9));
        Assert.assertFalse(new TwoSumPartFour().findTarget(root, 28));
    }

    @Test
    public void empty() {
        TreeNode root = null;
        Assert.assertFalse(new TwoSumPartFour().findTarget(root, 100500));
    }

    @Test
    public void one() {
        TreeNode root = new TreeNode(1);
        Assert.assertFalse(new TwoSumPartFour().findTarget(root, 1));
    }
}
