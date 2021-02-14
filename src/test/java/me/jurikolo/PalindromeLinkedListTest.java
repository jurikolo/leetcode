package me.jurikolo;

import me.jurikolo.extra.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class PalindromeLinkedListTest {
    @Test
    public void singleItem() {
        ListNode head = new ListNode(0);
        Assert.assertTrue(new PalindromeLinkedList().isPalindrome(head));
    }

    @Test
    public void twoItems() {
        ListNode head = new ListNode(0);
        head.next = new ListNode(0);
        Assert.assertTrue(new PalindromeLinkedList().isPalindrome(head));

        head = new ListNode(0);
        head.next = new ListNode(1);
        Assert.assertFalse(new PalindromeLinkedList().isPalindrome(head));
    }

    @Test
    public void threeItems() {
        ListNode head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(0);
        Assert.assertTrue(new PalindromeLinkedList().isPalindrome(head));

        head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(1);
        Assert.assertFalse(new PalindromeLinkedList().isPalindrome(head));
    }

    @Test
    public void fourItems() {
        ListNode head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(0);
        Assert.assertTrue(new PalindromeLinkedList().isPalindrome(head));

        head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(0);
        Assert.assertFalse(new PalindromeLinkedList().isPalindrome(head));
    }

    @Test
    public void fiveItems() {
        ListNode head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        head.next.next.next.next = new ListNode(0);
        Assert.assertTrue(new PalindromeLinkedList().isPalindrome(head));

        head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(0);
        Assert.assertFalse(new PalindromeLinkedList().isPalindrome(head));
    }

    @Test
    public void sixItems() {
        ListNode head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next = new ListNode(0);
        Assert.assertTrue(new PalindromeLinkedList().isPalindrome(head));

        head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next = new ListNode(1);
        Assert.assertFalse(new PalindromeLinkedList().isPalindrome(head));
    }
}
