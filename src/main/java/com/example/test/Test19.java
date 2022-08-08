package com.example.test;

public class Test19
{
    //Definition for singly-linked list.
     class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode list= new ListNode(0,head);
        int sz=0;
        ListNode tmp=head;
        while(tmp!=null)
        {
            tmp=tmp.next;
            sz++;
        }
        tmp=list;
        for(int i=1;i<=sz-n;i++)
        {
            tmp=tmp.next;
        }
        tmp.next=tmp.next.next;
        return list.next;
    }
}
