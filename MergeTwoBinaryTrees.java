public class MergeTwoBinaryTrees {
   public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
   }
   public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
      if (t1 != null && t2 != null) {
         t1.val += t2.val;
         t1.left = mergeTrees(t1.left, t2.left);
         t1.right = mergeTrees(t1.right, t2.right);
      }
      else if (t1 == null && t2 != null) {
         return t2;
      }
      else if (t1 != null) {
         return t1;
      }
      else {
         return null;
      }
      return t1;
   }

   public static void main(String[] args) {
      TreeNode t1 = new TreeNode(1);
      t1.left = new TreeNode(2);
      t1.right = new TreeNode(3);
      t1.right.right = new TreeNode(7);
      TreeNode t2 = new TreeNode(1);
      t2.left = new TreeNode(2);
      TreeNode output = mergeTrees(t1, t2);
      System.out.println(output.right.right.val);
   }
}
