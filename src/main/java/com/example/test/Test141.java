package com.example.test;
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Test141 {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> list = new HashSet<ListNode>();
        while (head != null) {
            if (!list.add(head)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }
}
