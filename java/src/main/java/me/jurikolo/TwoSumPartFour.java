package me.jurikolo;

/*
 * https://leetcode.com/problems/two-sum-iv-input-is-a-bst/description
 * Given a Binary Search Tree and a target number.
 * Return true if there exist two elements in the BST such that their sum is equal to the given target.
 */

import me.jurikolo.extra.TreeNode;

import java.util.HashSet;
import java.util.Set;

public class TwoSumPartFour {
    Set<Integer> set = new HashSet<>();
    public boolean findTarget(TreeNode root, int k) {
        if (root == null) {
            return false;
        }
        boolean result = false;

        fillSet(root);
        Set<Integer> dummySet = new HashSet<>();
        dummySet.addAll(set);
        for(int i: set) {
            dummySet.remove(i);
            if(dummySet.contains(k - i)) return true;
        }
        return result;

    }

    public void fillSet(TreeNode root) {
        set.add(root.val);
        if(root.left != null) fillSet(root.left);
        if(root.right != null) fillSet(root.right);
    }
}
