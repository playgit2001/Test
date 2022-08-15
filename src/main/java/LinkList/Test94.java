package LinkList;

public class Test94 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null||head.next==null||left==right)return head;
        ListNode res=new ListNode(0,head);//头指针
        head=res;
        for(int i=1;i<left;i++)
            head=head.next;
        ListNode dummy=head;//记录left前一个的位置
        head=head.next;
        ListNode L=new ListNode(head.val,null);
        ListNode dummy2=L;//记录反转后的right位置，方便right+1位置的操作，如是否为null。
        head=head.next;
        for(int i=0;i<right-left;i++)
        {   ListNode L1=new ListNode(head.val,L);
            L=L1;
            head=head.next;
        }
        dummy.next=L;
        if(head!=null)
            dummy2.next=head;
        else dummy2.next=null;
        return res.next;
    }
}
