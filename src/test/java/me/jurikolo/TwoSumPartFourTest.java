package me.jurikolo;

import me.jurikolo.extra.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSumPartFourTest {
    @Test
    public void example() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(6);
        root.right.right = new TreeNode(7);
        Assertions.assertTrue(new TwoSumPartFour().findTarget(root, 9));
        Assertions.assertFalse(new TwoSumPartFour().findTarget(root, 28));
    }

    @Test
    public void empty() {
        TreeNode root = null;
        Assertions.assertFalse(new TwoSumPartFour().findTarget(root, 100500));
    }

    @Test
    public void one() {
        TreeNode root = new TreeNode(1);
        Assertions.assertFalse(new TwoSumPartFour().findTarget(root, 1));
    }
}
