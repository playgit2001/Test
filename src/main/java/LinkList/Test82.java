package LinkList;
//给定一个已排序的链表的头 head ， 删除原始链表中所有重复数字的节点，只留下不同的数字 。
// 返回 已排序的链表 。
public class Test82 {
    public ListNode deleteDuplicates(ListNode head) {
        //基本思路：迭代
        //将当前结点的下一个结点tail进行判断。
        //如果tail结点的一个结点非空同时tail结点的值与他的下一个结点的值相等，将tail移向下一个
        //经过上一步操作，如果tail结点的位置未变化，说明不存在与tail结点的值相等的结点，当前结点移向当前的下一个结点即tail结点。
        //如果tail结点变化，那么tail的next指向tail的下一个结点，即跳过了中间重复的结点，指向null或者是与当前tail不同值的下一个结点。
        if(head==null||head.next==null)return null;
        ListNode dummy=new ListNode(0,head);
        ListNode res=dummy;
        while(dummy.next!=null)
        {
            ListNode tail=dummy.next;
            while(tail.next!=null&&tail.val==tail.next.val)
                tail=tail.next;
            if(dummy.next==tail)
            {
                dummy=dummy.next;//注意这边dummy=tail也可以，不知道为什么多占用0.6MB的内存空间。
            }else {
                dummy.next=tail.next;
            }

        }
        return res;
    }
    //递归，思路基本和上面差不多。
    //他的思想是，查到一个非连续的，返回给上一个非连续的。
    /*public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null)
            return head;
        if(head.val!=head.next.val)
        {
            head.next=deleteDuplicates(head.next);
            return head;
        }else {
            ListNode tmp=head.next.next;
            while(tmp!=null&&tmp.val==head.val)
                tmp=tmp.next;
            return deleteDuplicates(tmp)
        }
    }*/

}
