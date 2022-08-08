package com.example.test;

public class Test24 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode swapPairs(ListNode head) {
            ListNode l1=new ListNode(0,head);
            ListNode curr=l1;
            while(curr.next!=null&&curr.next.next!=null)
            {
                ListNode l2=curr.next;
                ListNode l3=curr.next.next.next;
                curr.next=curr.next.next;
                curr.next.next=l2;
                curr.next.next.next=l3;
                curr=curr.next.next;
            }
            return l1.next;
        }
    }

}
