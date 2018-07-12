public class LengthOfLastWord {
   public static int lengthOfLastWord(String s) {
      int i = s.trim().length() - 1;
      int length = 0;
      while (i >= 0 && s.trim().charAt(i) != ' ') {
         i--;
         length++;
      }
      return length;
   }
}
