import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Test6 {
    //通过栈的使用，结果运行时间炸了
    public int[] reversePrint(ListNode head) {
        if(head==null)return null;
        Stack<Integer> stack=new Stack<>();
        while(head!=null)
        {
            stack.push(head.val);
            head=head.next;
        }
        int size = stack.size();
        int[] print = new int[size];
        for (int i = 0; i < size; i++) {
            print[i] = stack.pop();
        }
        return print;
    }

    //递归，运行速度没问题，内存炸了
    ArrayList<Integer> tmp = new ArrayList<Integer>();
    public int[] reversePrint1(ListNode head) {
        recur(head);
        int[] res = new int[tmp.size()];
        for(int i = 0; i < res.length; i++)
            res[i] = tmp.get(i);
        return res;
    }
    void recur(ListNode head) {
        if(head == null) return;
        recur(head.next);
        tmp.add(head.val);
    }
}
