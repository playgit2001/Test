package com.example.test;

import java.util.ArrayList;
import java.util.List;

public class Test144 {
      class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result =new ArrayList<Integer>();
        pre(root,result);
        return result;
    }
    public void pre(TreeNode t,List<Integer> result)
    {
        if(t==null)
            return;
        result.add(t.val);
        pre(t.left,result);
        pre(t.right,result);
    }
}
