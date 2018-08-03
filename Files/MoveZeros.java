package Files;
import java.util.LinkedList;
import java.util.Queue;

public class MoveZeros {
   public static void moveZeroes(int[] nums) {
      int i;
      Queue<Integer> q = new LinkedList<>();
      for (i = 0; i < nums.length; i++) {
         if (nums[i] != 0) q.add(nums[i]);
      }
      for (i = 0; i < nums.length; i++) {
         if (!(q.isEmpty())) nums[i] = q.remove();
         else nums[i] = 0;
      }
   }
}
