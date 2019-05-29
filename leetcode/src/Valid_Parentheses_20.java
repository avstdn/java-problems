import java.util.ArrayDeque;
import java.util.HashMap;

public class Valid_Parentheses_20 {
    public boolean isValid(String s) {

        char[] ch = s.toCharArray();
        HashMap<Character, Character> brackets = new HashMap() {{
            put(')', '(');
            put('}', '{');
            put(']', '[');
        }};
        ArrayDeque stack = new ArrayDeque();

        for (char c : ch) {
            if (isOpen(c)) stack.push(c);
            else {
                if (!stack.isEmpty() && stack.pop() == brackets.get(c)) continue;
                else return false;
            }
        }

        return stack.isEmpty();
    }

    public boolean isOpen(char c) {
        return c == '(' || c == '{' || c == '[';
    }
}
// https://leetcode.com/problems/valid-parentheses/