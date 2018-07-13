public class QueueReconstructionByHeight {
   public static int[][] reconstructQueue(int[][] people) {
      // TODO
      int[] tmp;
      for (int i=1; i<people.length; i++) {
         if (people[i][0] > people[i-1][0]) {
            int j = i;
            while (people[j][1] < people[j-1][1]) {
               tmp = people[j-1];
               people[j-1] = people[j];
               people[j] = tmp;
               j++;
            }
            if (people[i][1] > people[i-1][1]) {

            }
            else {

            }
         }
         else if (people[i][0] < people[i-1][0]) {
            if (people[i][1] < people[i-1][1]) {

            }
            else if (people[i][1] > people[i-1][1]){

            }
            else {

            }
         }
         else {
            if (people[i][1] < people[i-1][1]) {

            }
            else if (people[i][1] > people[i-1][1]){

            }
            else {

            }
         }
      }
      return new int[][]{};
   }
}
