package Files;
import java.util.List;
import java.util.LinkedList;

public class FindDisappearedNumbers {
   public static List<Integer> findDisappearedNumbers(int[] nums) {
      List<Integer> l = new LinkedList<>();
      for (int i=1; i<=nums.length; i++) {
         l.add(i);
      }
      for (int i=0; i<nums.length; i++) {
         l.remove((Integer) nums[i]);
      }
      return l;
   }

   public static void main(String[] args) {
      System.out.println(findDisappearedNumbers(new int[]{}));
   }
}
