package me.jurikolo;

import me.jurikolo.extra.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddTwoNumbersTest {

    @Test
    public void zero() {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
        ListNode result = new AddTwoNumbers().addTwoNumbers(l1, l2);
        Assertions.assertEquals(0, result.val);
    }

    @Test
    public void EightHundredSeven() {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        ListNode result = new AddTwoNumbers().addTwoNumbers(l1, l2);
        Assertions.assertEquals(7, result.val);
        Assertions.assertEquals(0, result.next.val);
        Assertions.assertEquals(8, result.next.next.val);
    }

    @Test
    public void Fifteen() {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(3);
        l2.next = new ListNode(1);
        ListNode result = new AddTwoNumbers().addTwoNumbers(l1, l2);
        Assertions.assertEquals(5, result.val);
        Assertions.assertEquals(1, result.next.val);
    }

    @Test
    public void Billion() {
        ListNode l1 = new ListNode(9);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(9);
        l2.next.next.next = new ListNode(9);
        l2.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next.next.next.next = new ListNode(9);
        ListNode result = new AddTwoNumbers().addTwoNumbers(l1, l2);
        Assertions.assertEquals(0, result.val);
        Assertions.assertEquals(0, result.next.val);
        Assertions.assertEquals(0, result.next.next.val);
        Assertions.assertEquals(0, result.next.next.next.val);
        Assertions.assertEquals(0, result.next.next.next.next.val);
        Assertions.assertEquals(0, result.next.next.next.next.next.val);
        Assertions.assertEquals(0, result.next.next.next.next.next.next.val);
        Assertions.assertEquals(0, result.next.next.next.next.next.next.next.val);
        Assertions.assertEquals(0, result.next.next.next.next.next.next.next.next.val);
        Assertions.assertEquals(0, result.next.next.next.next.next.next.next.next.next.val);
        Assertions.assertEquals(1, result.next.next.next.next.next.next.next.next.next.next.val);
    }
}
