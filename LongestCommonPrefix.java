import java.util.Arrays;

public class LongestCommonPrefix {
   public static String longestCommonPrefix(String[] strs) {
      if (strs.length == 0) {
         return "";
      }
      else if (strs.length == 1) {
         return LCP(strs[0], strs[0]);
      }
      else if (strs.length == 2) {
         return LCP(strs[0], strs[1]);
      }
      else {
         String[] sideOne = Arrays.copyOfRange(strs, 0, (strs.length+1)/2);
         String[] sideTwo = Arrays.copyOfRange(strs, (strs.length+1)/2, strs.length);
         return LCP(longestCommonPrefix(sideOne), longestCommonPrefix(sideTwo));
      }
   }
   public static String LCP(String strOne, String strTwo) {
      String output = "";
      int i = 0;
      while (i<strTwo.length() && i<strOne.length() && strOne.charAt(i) == strTwo.charAt(i)) {
         output += strOne.charAt(i);
         i++;
      }
      return output;
   }
}
