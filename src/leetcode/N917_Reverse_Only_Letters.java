package leetcode;

/**
 * Given a string S, return the "reversed" string where all characters that are
 * not a letter stay in the same place, and all letters reverse their positions.
 *
 * Example 1:
 * Input: "ab-cd"
 * Output: "dc-ba"
 *
 * Example 2:
 * Input: "a-bC-dEf-ghIj"
 * Output: "j-Ih-gfE-dCba"
 *
 * Example 3:
 * Input: "Test1ng-Leet=code-Q!"
 * Output: "Qedo1ct-eeLg=ntse-T!"
 *
 * Note:
 * S.length <= 100
 * 33 <= S[i].ASCIIcode <= 122
 * S doesn't contain \ or "
 */

public class N917_Reverse_Only_Letters {
    public String reverseOnlyLetters(String S) {
        StringBuilder sb = new StringBuilder(S);

        for (int left = 0, right = S.length() - 1; left < right;) {
            if (Character.isLetter(S.charAt(left)) && Character.isLetter(S.charAt(right))) {
                sb.setCharAt(left, S.charAt(right));
                sb.setCharAt(right, S.charAt(left));
                left++;
                right--;
            } else {
                if (!Character.isLetter(S.charAt(left))) left++;
                if (!Character.isLetter(S.charAt(right))) right--;
            }
        }

        return sb.toString();
    }
}

// https://leetcode.com/problems/reverse-only-letters/