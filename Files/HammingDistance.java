package Files;

public class HammingDistance {
   public static int hammingDistance(int x, int y) {
      String val = Integer.toBinaryString(x^y);
      int diff = 0;
      for (int i=0; i<val.length(); i++) {
         if (val.charAt(i) == '1') {
            diff++;
         }
      }
      return diff;
   }
}
