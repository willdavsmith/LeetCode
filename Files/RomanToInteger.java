package Files;
import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
   public static int romanToInt(String s) {
      Map<Character, Integer> rv = new HashMap<>();
      rv.put(' ', 0);
      rv.put('I', 1);
      rv.put('V', 5);
      rv.put('X', 10);
      rv.put('L', 50);
      rv.put('C', 100);
      rv.put('D', 500);
      rv.put('M', 1000);
      int output = 0;
      s += ' ';
      for (int i=0; i<s.length()-1; i++) {
         if (rv.get(s.charAt(i)) < rv.get(s.charAt(i+1))) {
            output += rv.get(s.charAt(i+1)) - rv.get(s.charAt(i));
            i++;
         }
         else {
            output += rv.get(s.charAt(i));
         }
      }
      return output;
   }
}
