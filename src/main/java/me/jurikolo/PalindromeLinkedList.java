package me.jurikolo;

import me.jurikolo.extra.ListNode;

public class PalindromeLinkedList {
    public Boolean isPalindrome(ListNode head) {
        if ((head == null) || (head.next == null)) {
            return true;
        }
        int cnt = 0;
        ListNode lastNode = head.next;
        while (lastNode.next != null) {
            cnt++;
            lastNode = lastNode.next;
        }
        if (head.val == lastNode.val) {
            return isPalindrome(head.next, cnt - 1);
        }
        return false;
    }

    public Boolean isPalindrome(ListNode head, int cnt) {
        if (cnt < 1) {
            return true;
        }
        ListNode lastNode = head;
        for (int i = 0; i < cnt; i++) {
            lastNode = lastNode.next;
        }
        if (head.val == lastNode.val) {
            return isPalindrome(head.next, cnt -2);
        }
        return false;
    }
}