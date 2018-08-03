package Files;

public class SearchInsertPosition {
   public static int searchInsertPosition(int[] nums, int target) {
      for (int i=0; i<nums.length; i++) {
         if (target <= nums[i]) {
            return i;
         }
      }
      return nums.length;
   }
}