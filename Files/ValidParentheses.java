package Files;
import java.util.Stack;

public class ValidParentheses {
   public static boolean validParentheses(String input) {
      Stack<Character> s = new Stack<>();
      for (int i=0; i<input.length(); i++) {
         if (input.charAt(i) == '(' || input.charAt(i) == '[' || input.charAt(i) == '{') {
            s.push(input.charAt(i));
         }
         else if ((input.charAt(i) == ')' || input.charAt(i) == ']' || input.charAt(i) == '}') && !s.empty()) {
            char popped = s.pop();
            switch (popped) {
               case '(':
                  if (input.charAt(i) != ')') {
                     return false;
                  }
                  break;
               case '[':
                  if (input.charAt(i) != ']') {
                     return false;
                  }
                  break;
               case '{':
                  if (input.charAt(i) != '}') {
                     return false;
                  }
                  break;
            }
         }
         else {
            return false;
         }
      }
      return s.empty();
   }
}
