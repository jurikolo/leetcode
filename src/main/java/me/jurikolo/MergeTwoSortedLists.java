package me.jurikolo;

/*
 * https://leetcode.com/problems/merge-two-sorted-lists/description
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 */

import me.jurikolo.extra.ListNode;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            ListNode lastNode = null;
            return lastNode;
        }
        ListNode lastNode = new ListNode(0);
        ListNode result = lastNode;
        while((l1 != null) || (l2 != null)) {
            if ((l1 != null) && (l2 != null) && (l1.val < l2.val)) {
                lastNode.val = l1.val;
                lastNode.next = new ListNode(0);
                lastNode = lastNode.next;
                l1 = l1.next;
            } else if ((l1 != null) && (l2 != null)) {
                lastNode.val = l2.val;
                lastNode.next = new ListNode(0);
                lastNode = lastNode.next;
                l2 = l2.next;
            } else if (l1 != null) {
                lastNode.val = l1.val;
                lastNode.next = new ListNode(0);
                if (l1.next != null) {
                    lastNode = lastNode.next;
                    l1 = l1.next;
                } else {
                    lastNode.next = null;
                    return result;
                }
            } else {
                lastNode.val = l2.val;
                lastNode.next = new ListNode(0);
                if (l2.next != null) {
                    lastNode = lastNode.next;
                    l2 = l2.next;
                } else {
                    lastNode.next = null;
                    return result;
                }
            }
        }
        return result;
    }
}
