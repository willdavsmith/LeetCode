package Files;

public class PalindromicSubstrings {
   //UPDATE NEEDED: Slow runtime
   public static int countSubstrings(String s) {
      s = s.trim();
      int total = s.length(), iter = 2;
      while (iter<=s.length()) {
         for (int i=0; i+iter<=s.length(); i++) {
            String reverse = new StringBuilder(s.substring(i, i+iter)).reverse().toString();
            if (s.substring(i, i+iter).equals(reverse)) total++;
         }
         iter++;
      }
      return total;
   }
}
