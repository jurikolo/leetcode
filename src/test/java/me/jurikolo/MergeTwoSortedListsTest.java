package me.jurikolo;

import me.jurikolo.extra.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeTwoSortedListsTest {
    @Test
    public void zero() {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
        ListNode result = new MergeTwoSortedLists().mergeTwoLists(l1, l2);
        Assertions.assertEquals(0, result.val);
        Assertions.assertEquals(0, result.next.val);
    }

    @Test
    public void oneTwoThree() {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        ListNode result = new MergeTwoSortedLists().mergeTwoLists(l1, l2);
        Assertions.assertEquals(1, result.val);
        Assertions.assertEquals(2, result.next.val);
        Assertions.assertEquals(3, result.next.next.val);
    }

    @Test
    public void empty() {
        ListNode l1 = null;
        ListNode l2 = null;
        ListNode result = new MergeTwoSortedLists().mergeTwoLists(l1, l2);
        Assertions.assertEquals(null, result);
    }

    @Test
    public void emptyAndZero() {
        ListNode l1 = null;
        ListNode l2 = new ListNode(0);
        ListNode result = new MergeTwoSortedLists().mergeTwoLists(l1, l2);
        Assertions.assertEquals(0, result.val);
        Assertions.assertEquals(null, result.next);
    }
}
