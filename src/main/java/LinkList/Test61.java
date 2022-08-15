package LinkList;
//旋转链表
//第一轮遍历大小，将最后一个结点连接第一个结点然后取模求出移位后最后一个数的位置，记录他的下一个结点，最终返回结点就是他。
// 然后将最后一个数的next置为null
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class Test61 {
     public ListNode trap(ListNode head,int k){
         if(head==null)return head;
         ListNode dummy=new ListNode(0,head);
         int size=1;
         while(head.next!=null){
             size++;
             head=head.next;
         }
         head.next=dummy.next;
         int t=size-k%size;
         ListNode head1=dummy.next;
         for(int i=1;i<t;i++)
         {
             head1=head1.next;
         }
         head=head1.next;
         head1.next=null;
         return head;
     }
}