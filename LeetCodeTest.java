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
}