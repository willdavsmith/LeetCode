package Tests;
import org.junit.Test;
import org.junit.Assert;
import Files.*;
import DataStructs.*;

import java.util.LinkedList;
import java.util.List;

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
      ListNode listOne = new ListNode(1);
      listOne.next = new ListNode(2);
      listOne.next.next = new ListNode(4);
      ListNode listTwo = new ListNode(1);
      listTwo.next = new ListNode(3);
      listTwo.next.next = new ListNode(4);
      ListNode output = MergeTwoLists.mergeTwoLists(listOne, listTwo);
      ListNode expected = new ListNode(1);
      expected.next = new ListNode(1);
      expected.next.next = new ListNode(2);
      expected.next.next.next = new ListNode(3);
      expected.next.next.next.next = new ListNode(4);
      expected.next.next.next.next.next = new ListNode(4);
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
      TreeNode treeOne = new TreeNode(1);
      treeOne.left = new TreeNode(2);
      treeOne.right = new TreeNode(3);
      TreeNode treeTwo = new TreeNode(1);
      treeTwo.left = new TreeNode(2);
      treeTwo.right = new TreeNode(3);
      TreeNode treeThree = new TreeNode(1);
      treeThree.left = new TreeNode(2);
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
      TreeNode t1 = new TreeNode(1);
      t1.left = new TreeNode(2);
      t1.right = new TreeNode(3);
      t1.right.right = new TreeNode(7);
      TreeNode t2 = new TreeNode(1);
      t2.left = new TreeNode(2);
      TreeNode output = MergeTwoBinaryTrees.mergeTrees(t1, t2);
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
      int[][] input = new int[][]{new int[]{7, 0}, new int[]{4, 4}, new int[]{7, 1},
            new int[]{5, 0}, new int[]{6, 1}, new int[]{5, 2}};
      int[][] output = QueueReconstructionByHeight.reconstructQueue(input);
      int[][] expected = new int[][]{new int[]{5, 0}, new int[]{7, 0}, new int[]{5, 2},
            new int[]{6, 1}, new int[]{4, 4}, new int[]{7, 1}};
      Assert.assertArrayEquals(output, expected);
   }

   @Test
   public void maxDepth() {
      TreeNode depthThree = new TreeNode(3);
      depthThree.left = new TreeNode(9);
      depthThree.right = new TreeNode(20);
      depthThree.right.left = new TreeNode(15);
      depthThree.right.right = new TreeNode(7);
      TreeNode nullNode = null;
      TreeNode depthOne = new TreeNode(2384);
      TreeNode depthTwo = new TreeNode(2);
      depthTwo.left = new TreeNode(0);
      assert (MaximumDepthOfBinaryTree.maxDepth(depthOne) == 1
            && MaximumDepthOfBinaryTree.maxDepth(depthTwo) == 2
            && MaximumDepthOfBinaryTree.maxDepth(depthThree) == 3
            && MaximumDepthOfBinaryTree.maxDepth(nullNode) == 0);
   }

   @Test
   public void invertTree() {
      TreeNode reverse = new TreeNode(4);
      reverse.left = new TreeNode(7);
      reverse.right = new TreeNode(2);
      reverse.left.left = new TreeNode(9);
      TreeNode reversed = InvertBinaryTree.invertTree(reverse);
      assert (reversed.right.right.val == 9);
   }

   @Test
   public void countSubstrings() {
      assert (PalindromicSubstrings.countSubstrings("aaa") == 6)
            && PalindromicSubstrings.countSubstrings("abaaca") == 9;
   }

   @Test
   public void findDisappearedNumbers() {
      List<Integer> expected = new LinkedList<>();
      expected.add(5);
      expected.add(6);
      List<Integer> output = FindDisappearedNumbers.findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1});
      assert (expected.get(0).equals(output.get(0)));
   }
}