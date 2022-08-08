package com.example.test;
//2. 两数相加
//给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
//
//请你将两个数相加，并以相同形式返回一个表示和的链表。
//
//你可以假设除了数字 0 之外，这两个数都不会以 0 开头。

  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
    ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      /*public static void main(String[] arg)
      {
          Solution solution = new Solution();
          ListNode l1= new ListNode(9);
          ListNode l2= new ListNode(1);
          ListNode l3= new ListNode(9);
          ListNode l4= new ListNode(9);
          ListNode l5= new ListNode(9);
          ListNode l6= new ListNode(9);
          ListNode l7= new ListNode(9);
          ListNode l8= new ListNode(9);
          ListNode l9= new ListNode(9);
          ListNode l10= new ListNode(9);
          ListNode l11= new ListNode(9);
          l2.next=l3;l3.next=l4;l4.next=l5;l5.next=l6;
          l6.next=l7;l7.next=l8;l8.next=l9;l9.next=l10;
          l10.next=l11;
          ListNode ln = solution.addTwoNumbers(l1,l2);

      }*/
  }
class Solution {
    //解决方案1，通过把链表完全变成整数，然后再相加，再构造链表，对于特别长的链表失效
    /*public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        long num1 = totalnum(l1);
        long num2 = totalnum(l2);
        System.out.println(num1);
        System.out.println(num2);
        long num = num1 + num2;
        System.out.println((int)(num%10));
        ListNode head = new ListNode((int)(num % 10));
        num=num/10;
        while (num != 0) {
            ListNode node = new ListNode((int)(num % 10));
            if (head.next == null) {
                head.next = node;
            } else {
                ListNode cur = head;
                while (cur.next != null) {
                    cur = cur.next;
                }
                cur.next = node;
            }
            if (num >= 10) {
                num=num/10;
            } else {return head;}
        }
        return head;
    }
    public long totalnum(ListNode l1) {
        int num = 0;
        long sum = 0;
        ListNode N = l1;
        sum = N.val;

        long p = 0;
        while (N.next != null) {
            N = N.next;
            num = num + 1;
            p = N.val;
            for (int i = 1; i <= num; i++)
                p = p * 10;
            sum += p;
        }
        return sum;
    }*/

    //方案2 两个链表一个字符一个字符读过去，脑壳疼，这个空指针问题
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
            flag=false;
            tmp+=(tmp1+tmp2);
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