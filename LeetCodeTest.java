import org.junit.Test;
import org.junit.Assert;

public class LeetCodeTest {
   @Test
   public void twoSum() {
      int [] input = new int[]{2, 8, 11, 4, 435, 23, 7, 9, 0, 43};
      int target = 19;
      int[] expected = new int[]{1, 2};
      int[] output = TwoSum.twoSum(input, target);
      Assert.assertArrayEquals(output, expected);
   }

   @Test
   public void longestCommonPrefix() {
      String[] input = new String[]{"flow", "flower", "flotsdam"};
      String expected = "flo";
      String output = LongestCommonPrefix.longestCommonPrefix(input);
      Assert.assertEquals(output, expected);
   }

   @Test
   public void mergeTwoLists() {
      MergeTwoLists.ListNode listOne = new MergeTwoLists.ListNode(1);
      listOne.next = new MergeTwoLists.ListNode(2);
      listOne.next.next = new MergeTwoLists.ListNode(4);
      MergeTwoLists.ListNode listTwo = new MergeTwoLists.ListNode(1);
      listTwo.next = new MergeTwoLists.ListNode(3);
      listTwo.next.next = new MergeTwoLists.ListNode(4);
      MergeTwoLists.ListNode output = MergeTwoLists.mergeTwoLists(listOne, listTwo);
      MergeTwoLists.ListNode expected = new MergeTwoLists.ListNode(1);
      expected.next = new MergeTwoLists.ListNode(1);
      expected.next.next = new MergeTwoLists.ListNode(2);
      expected.next.next.next = new MergeTwoLists.ListNode(3);
      expected.next.next.next.next = new MergeTwoLists.ListNode(4);
      expected.next.next.next.next.next = new MergeTwoLists.ListNode(4);
      Assert.assertEquals(output.val, expected.val);
   }

   @Test
   public void lengthOfLastWord() {
      assert LengthOfLastWord.lengthOfLastWord("$ Hello    ##$Q World    ") == 5;
   }

   @Test
   public void validParentheses() {
      assert ValidParentheses.validParentheses("()[]{[()]}") && !ValidParentheses.validParentheses("]");
   }

   @Test
   public void singleNumber() {
      assert SingleNumber.singleNumber(new int[]{1, 2, 2}) == 1;
   }

   @Test
   public void isSameTree() {
      SameTree.TreeNode treeOne = new SameTree.TreeNode(1);
      treeOne.left = new SameTree.TreeNode(2);
      treeOne.right = new SameTree.TreeNode(3);
      SameTree.TreeNode treeTwo = new SameTree.TreeNode(1);
      treeTwo.left = new SameTree.TreeNode(2);
      treeTwo.right = new SameTree.TreeNode(3);
      SameTree.TreeNode treeThree = new SameTree.TreeNode(1);
      treeThree.left = new SameTree.TreeNode(2);
      assert (SameTree.isSameTree(treeOne, treeTwo) && !SameTree.isSameTree(treeTwo, treeThree));
   }

   @Test
   public void reverseInteger() {
      assert (ReverseInteger.reverseInteger(-32151) == -15123);
   }

   @Test
   public void romanToInt() {
      assert (RomanToInteger.romanToInt("MCMXCIV") == 1994 && RomanToInteger.romanToInt("LVIII") == 58);
   }

   @Test
   public void searchInsertPosition() {
      assert (SearchInsertPosition.searchInsertPosition(new int[]{1, 3, 5, 6}, 5) == 2);
   }

   @Test
   public void hammingDistance() {
      assert (HammingDistance.hammingDistance(1, 4) == 2);
   }

   @Test
   public void mergeTrees() {
      MergeTwoBinaryTrees.TreeNode t1 = new MergeTwoBinaryTrees.TreeNode(1);
      t1.left = new MergeTwoBinaryTrees.TreeNode(2);
      t1.right = new MergeTwoBinaryTrees.TreeNode(3);
      t1.right.right = new MergeTwoBinaryTrees.TreeNode(7);
      MergeTwoBinaryTrees.TreeNode t2 = new MergeTwoBinaryTrees.TreeNode(1);
      t2.left = new MergeTwoBinaryTrees.TreeNode(2);
      MergeTwoBinaryTrees.TreeNode output = MergeTwoBinaryTrees.mergeTrees(t1, t2);
      assert output.right.right.val == 7;
   }

   @Test
   public void countBits() {
      assert (2 == CountingBits.countBits(5)[5]);
   }

   @Test
   public void moveZeroes() {
      int[] move = new int[]{0, 1, 4, 5, 7, 0 , 9, 0};
      MoveZeros.moveZeroes(move);
      String output = "";
      String expected = "14579000";
      for (int a : move) {
         output += a;
      }
      assert output.equals(expected);
   }

   @Test
   public void reconstructQueue() {
      int[][] input = new int[][]{new int[]{7, 0}, new int[]{4, 4}, new int[]{7, 1}, new int[]{5, 0}, new int[]{6, 1}, new int[]{5, 2}};
      int[][] output = QueueReconstructionByHeight.reconstructQueue(input);
      int[][] expected = new int[][]{new int[]{5, 0}, new int[]{7, 0}, new int[]{5, 2}, new int[]{6, 1}, new int[]{4, 4}, new int[]{7, 1}};
      Assert.assertArrayEquals(output, expected);
   }

   @Test
   public void maxDepth() {
      MaximumDepthOfBinaryTree.TreeNode depthThree = new MaximumDepthOfBinaryTree.TreeNode(3);
      depthThree.left = new MaximumDepthOfBinaryTree.TreeNode(9);
      depthThree.right = new MaximumDepthOfBinaryTree.TreeNode(20);
      depthThree.right.left = new MaximumDepthOfBinaryTree.TreeNode(15);
      depthThree.right.right = new MaximumDepthOfBinaryTree.TreeNode(7);
      MaximumDepthOfBinaryTree.TreeNode nullNode = null;
      MaximumDepthOfBinaryTree.TreeNode depthOne = new MaximumDepthOfBinaryTree.TreeNode(2384);
      MaximumDepthOfBinaryTree.TreeNode depthTwo = new MaximumDepthOfBinaryTree.TreeNode(2);
      depthTwo.left = new MaximumDepthOfBinaryTree.TreeNode(0);
      assert (MaximumDepthOfBinaryTree.maxDepth(depthOne) == 1 && MaximumDepthOfBinaryTree.maxDepth(depthTwo) == 2 && MaximumDepthOfBinaryTree.maxDepth(depthThree) == 3 && MaximumDepthOfBinaryTree.maxDepth(nullNode) == 0);
   }

   @Test
   public void invertTree() {
      InvertBinaryTree.TreeNode reverse = new InvertBinaryTree.TreeNode(4);
      reverse.left = new InvertBinaryTree.TreeNode(7);
      reverse.right = new InvertBinaryTree.TreeNode(2);
      reverse.left.left = new InvertBinaryTree.TreeNode(9);
      InvertBinaryTree.TreeNode reversed = InvertBinaryTree.invertTree(reverse);
      assert (reversed.right.right.val == 9);
   }
}