package me.jurikolo;

import me.jurikolo.extra.ListNode;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode l = new AddTwoNumbers().addTwoNumbers(l1, l2);
    }
}
