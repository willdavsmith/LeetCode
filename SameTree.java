public class SameTree {
   public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
   }
   public static boolean isSameTree(TreeNode p, TreeNode q) {
      if ((p == null || q == null)) {
         return p == null && q == null;
      }
      return p.val == q.val && (isSameTree(p.right, q.right) && isSameTree(p.left, q.left));
   }
}
