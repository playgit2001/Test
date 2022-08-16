package binary_tree;


import java.util.HashMap;

public class Test106 {
    //Leetcode106，关于从中序与后序遍历序列构造二叉树。
    HashMap<Integer,Integer>map=new HashMap<>();
    int[] inorder;
    int[] postorder;
    int size;
    private TreeNode rebuild(int left,int right){
        if(left>right)
            return null;
        int t=postorder[size];
        TreeNode root=new TreeNode(t);
        int index=map.get(t);

        size--;
        //这个说到底是基于中序序列开发，下面的这一段，是right而不是right-1.
        root.right=rebuild(index+1,right);

        root.left=rebuild(left,index-1);
        return root;

    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        this.inorder=inorder;
        this.postorder=postorder;
        size=inorder.length-1;
        int idx=0;
        for(int i:inorder)
        {
            map.put(i,idx++);
        }
        return rebuild(0,inorder.length-1);
    }
}
