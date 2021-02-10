package me.jurikolo;

import me.jurikolo.extra.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class AddTwoNumbersTest {

    @Test
    public void zero() {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
        ListNode result = new AddTwoNumbers().addTwoNumbers(l1, l2);
        Assert.assertEquals(0, result.val);
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
        Assert.assertEquals(7, result.val);
        Assert.assertEquals(0, result.next.val);
        Assert.assertEquals(8, result.next.next.val);
    }

    @Test
    public void Fifteen() {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(3);
        l2.next = new ListNode(1);
        ListNode result = new AddTwoNumbers().addTwoNumbers(l1, l2);
        Assert.assertEquals(5, result.val);
        Assert.assertEquals(1, result.next.val);
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
        Assert.assertEquals(0, result.val);
        Assert.assertEquals(0, result.next.val);
        Assert.assertEquals(0, result.next.next.val);
        Assert.assertEquals(0, result.next.next.next.val);
        Assert.assertEquals(0, result.next.next.next.next.val);
        Assert.assertEquals(0, result.next.next.next.next.next.val);
        Assert.assertEquals(0, result.next.next.next.next.next.next.val);
        Assert.assertEquals(0, result.next.next.next.next.next.next.next.val);
        Assert.assertEquals(0, result.next.next.next.next.next.next.next.next.val);
        Assert.assertEquals(0, result.next.next.next.next.next.next.next.next.next.val);
        Assert.assertEquals(1, result.next.next.next.next.next.next.next.next.next.next.val);
    }
}
