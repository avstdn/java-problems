package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a string S, we can transform every letter individually
 * to be lowercase or uppercase to create another string.
 * Return a list of all possible strings we could create.
 *
 * Examples:
 *
 * Input: S = "a1b2"
 * Output: ["a1b2", "a1B2", "A1b2", "A1B2"]
 *
 * Input: S = "3z4"
 * Output: ["3z4", "3Z4"]
 *
 * Input: S = "12345"
 * Output: ["12345"]
 *
 * Note:
 * S will be a string with length between 1 and 12.
 * S will consist only of letters or digits.
 */
public class N784_Letter_Case_Permutation {
    public List<String> letterCasePermutation(String S) {
        List<String> list = new ArrayList<>();

        getPermutation(list, 0, S.toCharArray());

        return list;
    }

    private void getPermutation(List<String> list, int i, char[] S) {
        if (i == S.length) list.add(new String(S));
        else {
            if (Character.isLetter(S[i])) {
                S[i] = Character.toUpperCase(S[i]);
                getPermutation(list, i + 1, S);
                S[i] = Character.toLowerCase(S[i]);
                getPermutation(list, i + 1, S);
            } else {
                getPermutation(list, i + 1, S);
            }
        }
    }
}
// https://leetcode.com/problems/letter-case-permutation/submissions/