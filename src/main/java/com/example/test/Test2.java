package com.example.test;

public class Test2 {
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
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            int sum1=count(l1);
            int sum2=count(l2);
            ListNode N1,N2;
            if(sum1>=sum2)
            {
                N1=l1;N2=l2;
            }
            else
            {
                N1=l2;N2=l1;
            }
            ListNode head=N1;
            boolean flag=false;
            boolean flag1=true;
            boolean flag2=true;
            int tmp=0;
            int tmp1,tmp2;
            tmp1=N1.val;tmp2= N2.val;
            tmp=tmp1+tmp2;
            if(tmp>=10) flag=true;
            N1.val=tmp%10;
            tmp=0;
            while(N1.next!=null){
                N1=N1.next;
                tmp1=N1.val;
                if(N2!=null&&N2.next!=null)
                {N2=N2.next;
                    tmp2=N2.val;}
                else if(N2!=null&&N2.next==null){
                    N2=N2.next;
                    tmp2=0;
                }
                else
                    tmp2=0;
                if(flag) tmp=tmp+1;
                System.out.println(tmp);
                System.out.println(flag);
                flag=false;
                tmp+=(tmp1+tmp2);
                System.out.println(tmp);
                if(tmp>=10) flag=true;
                N1.val=tmp%10;
                tmp=0;

            }
            if(flag)
            {
                ListNode ln1=new ListNode(1);
                N1.next=ln1;
            }
            return head;
        }
        public int count(ListNode l1)
        {
            int sum=0;
            ListNode N = l1;
            while (N.next != null) {
                N = N.next;
                sum = sum + 1;
            }
            return sum;
        }
    }
}
