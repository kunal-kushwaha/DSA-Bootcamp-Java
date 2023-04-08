import java.util.Stack;

class Solution {
  public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();

    for (char ch : s.toCharArray()) {
      if (ch == '(' || ch == '{' || ch == '[') {
        stack.push(ch);
      } else {
        if (ch == ')') {
          if (stack.isEmpty() || stack.pop() != '(') {
            return false;
          }
        }
        if (ch == '}') {
          if (stack.isEmpty() || stack.pop() != '{') {
            return false;
          }
        }
        if (ch == ']') {
          if (stack.isEmpty() || stack.pop() != '[') {
            return false;
          }
        }
      }
    }
    return stack.isEmpty();
  }
}