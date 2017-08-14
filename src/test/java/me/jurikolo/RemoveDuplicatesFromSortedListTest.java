package me.jurikolo;

import me.jurikolo.extra.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveDuplicatesFromSortedListTest {
    @Test
    public void zero() {
        ListNode l2 = new ListNode(0);
        ListNode result = new RemoveDuplicatesFromSortedList().deleteDuplicates(l2);
        Assertions.assertEquals(0, result.val);
        Assertions.assertEquals(null, result.next);
    }

    @Test
    public void exampleOne() {
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(1);
        l2.next.next = new ListNode(2);
        ListNode result = new RemoveDuplicatesFromSortedList().deleteDuplicates(l2);
        Assertions.assertEquals(1, result.val);
        Assertions.assertEquals(2, result.next.val);
        Assertions.assertEquals(null, result.next.next);
    }

    @Test
    public void exampleTwo() {
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(1);
        l2.next.next = new ListNode(2);
        l2.next.next.next = new ListNode(3);
        l2.next.next.next.next = new ListNode(3);
        ListNode result = new RemoveDuplicatesFromSortedList().deleteDuplicates(l2);
        Assertions.assertEquals(1, result.val);
        Assertions.assertEquals(2, result.next.val);
        Assertions.assertEquals(3, result.next.next.val);
        Assertions.assertEquals(null, result.next.next.next);
    }

    @Test
    public void oneOneOne() {
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(1);
        l2.next.next = new ListNode(1);
        ListNode result = new RemoveDuplicatesFromSortedList().deleteDuplicates(l2);
        Assertions.assertEquals(1, result.val);
        Assertions.assertEquals(null, result.next);
    }
}
