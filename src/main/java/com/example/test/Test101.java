package com.example.test;

public class Test101 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, Test100.TreeNode left, Test100.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public boolean isSymmetric(TreeNode root) {
        if(root.left==null && root.right==null)
            return true;
        else if(root.left==null ||root.right==null)
            return false;
        else return isSameTree(root.left,root.right);
    }
    public boolean isSameTree(TreeNode p,TreeNode q)
    {
        if (p == null && q == null) {
            return true;
        } else if ((p == null&&q!=null) || (q == null&&p!=null)) {
            return false;
        } else if (p.val != q.val) {
            return false;
        } else {
            return isSameTree(p.left, q.right) && isSameTree(p.right, q.left);
        }
    }
}
