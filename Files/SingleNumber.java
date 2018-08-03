package Files;
import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
   public static int singleNumber(int[] nums) {
      Map<Integer, Integer> comparator = new HashMap<>();
      for (int num : nums) {
         if (!comparator.containsKey(num)) {
            comparator.put(num, 1);
         }
         else {
            comparator.put(num, 2);
         }
      }
      int output = 0;
      for (int num : nums) {
         if (comparator.get(num).equals(1)) {
            output = num;
         }
      }
      return output;
   }
}
