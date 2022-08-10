

  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class Test23 {
    public ListNode mergeKLists(ListNode[] lists)
    {
        ListNode x = null;
        for (ListNode y : lists)
            x = merge(x, y);
        return x;
    }

    public ListNode merge(ListNode a, ListNode b)
    {
        ListNode dummy = new ListNode(-1);
        ListNode x = dummy;
        while (a != null && b != null)
        {
            if (a.val < b.val)
            {
                x.next = a;
                a = a.next;
            }
            else
            {
                x.next = b;
                b = b.next;
            }
            x = x.next;
        }
        if (a != null)
            x.next = a;
        if (b != null)
            x.next = b;
        return dummy.next;
    }
}
