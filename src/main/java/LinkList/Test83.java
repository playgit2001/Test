package LinkList;
//给定一个已排序的链表的头 head ， 删除所有重复的元素，使每个元素只出现一次 。返回 已排序的链表 。
//迭代法，跟82类似的理念。
public class Test83 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null)return head;
        ListNode dummy=new ListNode(0,head);
        ListNode res=dummy;
        while (dummy.next!=null){
            ListNode tail=dummy.next;
            while(tail.next!=null&&tail.val==tail.next.val)
                tail=tail.next;
            if(tail==dummy.next)
                dummy=dummy.next;
            else {
                dummy.next=tail;
            }
        }
        return res.next;
    }
}
