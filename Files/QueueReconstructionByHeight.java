package Files;
import java.util.Set;
import java.util.HashSet;

public class QueueReconstructionByHeight {
   public static int[][] reconstructQueue(int[][] people) {
      int[][] output = new int[people.length][2];
      Set<Integer> set = new HashSet<>();
      for (int[] i : people) {
         set.add(i[0]);
      }
      for (Integer setInt : set) {
         for (int[] element : people) {
            if (element[0] == setInt) {
               placeInQueue(element, output);
            }
         }
      }
      return output;
   }

   public static void placeInQueue(int[] e, int[][] q) {
      int empty = 0;
      for (int[] item : q) {
         if (item[0] == 0) {
            empty++;
         }
      }
      if (empty > 1) {
         int i=e[1];
         int j;
         for (j=0; i>0; j++) {
            if (q[j][0] == 0 || e[0] == q[j][0]) {
               i--;
            }
         }
         while (q[j][0] != 0) {
            j++;
         }
         q[j] = e;
      }
      else {
         for (int i=0; i<q.length; i++) {
            if (q[i][0] == 0) {
               q[i] = e;
            }
         }
      }
   }
}
