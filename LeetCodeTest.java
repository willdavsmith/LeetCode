import org.junit.Test;

public class LeetCodeTest {
   @Test
   public void twoSum() {
      int [] input = new int[]{2, 8, 11, 4, 435, 23, 7, 9, 0, 43};
      int target = 19;
      int[] expected = new int[]{1, 2};
      int[] output = TwoSum.twoSum(input, target);
      assert (expected[0] == output[0] && expected[1] == output[1]);
   }

   @Test
   public void longestCommonPrefix() {
      assert ("flo".equals(LongestCommonPrefix.longestCommonPrefix(new String[]{"flow", "flower", "flotsdam"})));
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
      assert (output.val == expected.val && output.next.next.val == expected.next.next.val && output.next.next.next.next.next.val == expected.next.next.next.next.next.val);
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
      int[][] output =QueueReconstructionByHeight.reconstructQueue(input);
      int[][] expected = new int[][]{new int[]{5, 0}, new int[]{7, 0}, new int[]{5, 2}, new int[]{6, 1}, new int[]{4, 4}, new int[]{7, 1}};
      boolean equal = true;
      for (int i=0; i<output.length; i++) {
         if (output[i] != expected[i]) {
            equal = false;
         }
      }
      assert equal;
   }
}