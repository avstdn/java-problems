public class N1021_Remove_Outermost_Parentheses {
    public String removeOuterParentheses(String S) {
        StringBuilder result = new StringBuilder();
        char open = '(';
        char close = ')';
        int count = 0;

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == open) {
                count++;
                if (count > 1) result.append(open);
            } else {
                if (count > 1) result.append(close);
                count--;
            }
        }

        return result.toString();
    }
}
// https://leetcode.com/problems/remove-outermost-parentheses/