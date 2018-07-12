public class ReverseInteger {
   public static int reverseInteger(int x) {
      String output = (x < 0) ? "-" : "";
      x = Math.abs(x);
      while (x >= 10) {
         output += x%10;
         x /= 10;
      }
      output += x;
      try {
         return Integer.parseInt(output);
      }
      catch (Exception e) {
         return 0;
      }
   }
}
