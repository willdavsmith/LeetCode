public class TwoSum {
   public static int[] twoSum(int[] nums, int target) {
      int [] output = new int[2];
      int indexOne = 0;
      for (int i : nums) {
         int indexTwo = 0;
         for (int j : nums) {
            if (i + j == target && indexOne != indexTwo) {
               output[0] = indexTwo;
               output[1] = indexOne;
            }
            indexTwo++;
         }
         indexOne++;
      }
      return output;
   }
}
