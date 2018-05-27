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
   public void addTwoNumbers() {
      AddTwoNumbers.ListNode l1 = new AddTwoNumbers.ListNode(2);
      l1.next = new AddTwoNumbers.ListNode(4);
      l1.next.next = new AddTwoNumbers.ListNode(3);
      AddTwoNumbers.ListNode l2 = new AddTwoNumbers.ListNode(5);
      l2.next = new AddTwoNumbers.ListNode(6);
      l2.next.next = new AddTwoNumbers.ListNode(4);

      AddTwoNumbers.ListNode output = AddTwoNumbers.addTwoNumbers(l1, l2);
      AddTwoNumbers.ListNode expected = new AddTwoNumbers.ListNode(7);
      expected.next = new AddTwoNumbers.ListNode(0);
      expected.next.next = new AddTwoNumbers.ListNode(8);

      assert (output.val == expected.val && output.next.val == expected.next.val && output.next.next.val == expected.next.next.val);
   }

   @Test
   public void longestCommonPrefix() {
      assert ("flo".equals(LongestCommonPrefix.longestCommonPrefix(new String[]{"flow", "flower", "flotsdam"})));
   }
}