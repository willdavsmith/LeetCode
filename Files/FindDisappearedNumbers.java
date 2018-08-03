package Files;
import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers {
   public static List<Integer> findDisappearedNumbers(int[] nums) {
      List<Integer> l = new ArrayList<>();
      boolean[] b = new boolean[nums.length+1];
      for (int i=0; i<nums.length; i++) {
         b[nums[i]] = true;

      }
      for (int i=1; i<b.length; i++) {
         if (!b[i]) l.add(i);
      }
      return l;
   }
}
