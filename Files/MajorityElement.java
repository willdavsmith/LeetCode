package Files;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
   //UPDATE NEEDED
   public static int majorityElement(int[] nums) {
      Map<Integer, Integer> m = new HashMap<>();
      Integer element = null;
      for (int i=0; element==null; i++) {
         if (nums.length == 1) element = nums[0];
         else if (!m.containsKey(nums[i])) m.put(nums[i], 1);
         else if ((m.get(nums[i])+1)<((nums.length/2)+1))
            m.replace(nums[i], m.get(nums[i])+1);
         else element = nums[i];
      }
      return element;
    }

   public static void main(String[] args) {
   }
}
