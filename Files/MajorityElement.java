package Files;

public class MajorityElement {
   public static int majorityElement(int[] nums) {
      int m=nums[0];
      for (int i=0, c=0; i<nums.length; i++) {
         if (m == nums[i]) c++;
         else if (c == 0) {
            c++;
            m = nums[i];
         }
         else c--;
      }
      return m;
    }
}
