package me.jurikolo;

import me.jurikolo.extra.ListNode;

public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode lastNode = head;
        while(lastNode.next != null) {
            if(lastNode.val == lastNode.next.val) {
                if (lastNode.next.next != null) {
                    lastNode.next = lastNode.next.next;
                }
                else {
                    lastNode.next = null;
                    return head;
                }
            } else {
                lastNode = lastNode.next;
            }
        }
        return head;
    }
}
