package Files;
import DataStructs.TreeNode;

public class SameTree {
   public static boolean isSameTree(TreeNode p, TreeNode q) {
      if ((p == null || q == null)) {
         return p == null && q == null;
      }
      return p.val == q.val && (isSameTree(p.right, q.right) && isSameTree(p.left, q.left));
   }
}
