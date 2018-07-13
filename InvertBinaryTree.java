public class InvertBinaryTree {
   public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
   }

   public static TreeNode invertTree(TreeNode root) {
      if (root == null) return null;
      else {
         TreeNode tmp;
         tmp = root.right;
         root.right = root.left;
         root.left = tmp;
         invertTree(root.left);
         invertTree(root.right);
      }
      return root;
   }
}
