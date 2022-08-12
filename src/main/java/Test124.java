

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
public class Test124 {
    int pathSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        dfs(root);
        return pathSum;
    }

    // dfs 返回以该节点为端点的最大路径和
    public int dfs(TreeNode node) {
        if (node == null) return 0;
        int left = dfs(node.left);
        int right = dfs(node.right);

        int ret = Math.max(node.val, node.val + Math.max(left, right));
        pathSum = Math.max(pathSum, Math.max(ret, node.val + left + right));
        return ret;
    }
}
