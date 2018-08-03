package Files;
import DataStructs.TreeNode;

public class MaximumDepthOfBinaryTree {
   public static int maxDepth(TreeNode root) {
      if (root == null) {
         return 0;
      }
      else {
         return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
      }
   }
}
