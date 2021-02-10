package me.jurikolo;

import me.jurikolo.extra.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesFromSortedListTest {
    @Test
    public void zero() {
        ListNode l2 = new ListNode(0);
        ListNode result = new RemoveDuplicatesFromSortedList().deleteDuplicates(l2);
        Assert.assertEquals(0, result.val);
        Assert.assertEquals(null, result.next);
    }

    @Test
    public void exampleOne() {
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(1);
        l2.next.next = new ListNode(2);
        ListNode result = new RemoveDuplicatesFromSortedList().deleteDuplicates(l2);
        Assert.assertEquals(1, result.val);
        Assert.assertEquals(2, result.next.val);
        Assert.assertEquals(null, result.next.next);
    }

    @Test
    public void exampleTwo() {
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(1);
        l2.next.next = new ListNode(2);
        l2.next.next.next = new ListNode(3);
        l2.next.next.next.next = new ListNode(3);
        ListNode result = new RemoveDuplicatesFromSortedList().deleteDuplicates(l2);
        Assert.assertEquals(1, result.val);
        Assert.assertEquals(2, result.next.val);
        Assert.assertEquals(3, result.next.next.val);
        Assert.assertEquals(null, result.next.next.next);
    }

    @Test
    public void oneOneOne() {
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(1);
        l2.next.next = new ListNode(1);
        ListNode result = new RemoveDuplicatesFromSortedList().deleteDuplicates(l2);
        Assert.assertEquals(1, result.val);
        Assert.assertEquals(null, result.next);
    }
}
