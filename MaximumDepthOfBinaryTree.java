public class MaximumDepthOfBinaryTree {
   public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
   }

   public static int maxDepth(TreeNode root) {
      if (root == null) {
         return 0;
      }
      else {
         return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
      }
   }
}
