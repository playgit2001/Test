package LinkList;

public class Test86 {
    //方法1，创建两个额外的链表，将大约等于x及小于x的结点分别保持相对顺序的保存在两个链表中，然后拼接他们。
        public ListNode partition(ListNode head, int x) {
            if(head==null)return head;
            ListNode L1=new ListNode(0);
            ListNode L2=new ListNode(0);
            ListNode dummy=head;
            ListNode dummy1=L1;
            ListNode dummy2=L2;
            while(head!=null){
                if(head.val<x)
                {L1.next=new ListNode(head.val);
                    L1=L1.next;}
                head=head.next;
            }

            head=dummy;
            while(head!=null){
                if(head.val>=x)
                {L2.next=new ListNode(head.val);
                    L2=L2.next;}
                head=head.next;
            }
            L2.next=null;
            L1.next=dummy2.next;
            return dummy1.next;
        }

}
