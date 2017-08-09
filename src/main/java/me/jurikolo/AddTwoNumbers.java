package me.jurikolo;

import me.jurikolo.extra.ListNode;

import java.math.BigInteger;

/*
 * https://leetcode.com/problems/add-two-numbers/description
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 *
 * HINT: 342 + 465 = 807 (reverse order)
 */

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigInteger result = BigInteger.valueOf(0);
        int pow = 0;
        while ((l1 != null) || (l2 != null)) {
            if ((l1 != null) && (l2 != null)) {
                result = result.add(BigInteger.valueOf((l1.val + l2.val)).multiply(BigInteger.valueOf(10).pow(pow)));
                l1 = l1.next;
                l2 = l2.next;
            } else if (l1 != null) {
                result = result.add(BigInteger.valueOf((l1.val)).multiply(BigInteger.valueOf(10).pow(pow)));
                l1 = l1.next;
            } else {
                result = result.add(BigInteger.valueOf((l2.val)).multiply(BigInteger.valueOf(10).pow(pow)));
                l2 = l2.next;
            }
            pow++;
        }

        ListNode lastNode = new ListNode(0);
        ListNode resultList = lastNode;
        lastNode.val = result.remainder(BigInteger.valueOf(10)).intValue();
        while(result.compareTo(BigInteger.valueOf(9)) > 0) {
            result = result.divide(BigInteger.valueOf(10));
            lastNode.next = new ListNode(result.remainder(BigInteger.valueOf(10)).intValue());
            lastNode = lastNode.next;
        }
        return resultList;
    }
}
