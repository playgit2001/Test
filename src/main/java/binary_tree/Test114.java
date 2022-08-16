package binary_tree;

import java.util.ArrayList;
import java.util.List;

public class Test114 {
    List<Integer> list = new ArrayList<>();

    //方案一，将左子树插入到右子树
    public void flatten(TreeNode root) {
        while (root != null) {
            if (root.left == null)
                root = root.right;
            else {//找到左子树的最右子树，如果左子树内没有直接的右子树，则直接选择左子树，把右子树接到左子树的最有子树。
                TreeNode pre = root.left;
                while (pre.right != null)
                    pre = pre.right;
                pre.right = root.right;
                root.right = root.left;
                root = root.right;
            }
        }
        //捞一点，先前序遍历读取所有值，然后用创建的方式，把树建立出来
    /*public void flatten(TreeNode root) {
            bianli(root);
            int length=list.size();
            if(length==0)return;
            if(length==1) {
                root.val=list.get(0);
            root.left=null;
            root.right=null;
            }
            for(int i=0;i<length-1;i++){
                root.left=null;
                root.val=list.get(i);
                TreeNode node=new TreeNode();
                root.right=node;
                root=root.right;
            }
        root.val=list.get(length-1);
        root.left=null;
        root.right=null;
        return;
        }
    private void bianli(TreeNode root){
        if(root==null)
            return;
        list.add(root.val);
        bianli(root.left);
        bianli(root.right);
    }*/
    }
}
