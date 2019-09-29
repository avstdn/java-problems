package leetcode;

/**
 * Given a column title as appear in an Excel sheet, return its corresponding column
 * number.
 *
 * For example:
 *     A -> 1
 *     B -> 2
 *     C -> 3
 *     ...
 *     Z -> 26
 *     AA -> 27
 *     AB -> 28
 *     ...
 *
 * Example 1:
 * Input: "A"
 * Output: 1
 *
 * Example 2:
 * Input: "AB"
 * Output: 28
 *
 * Example 3:
 * Input: "ZY"
 * Output: 701
 */
public class N171_Excel_Sheet_Column_Number {
    public int titleToNumber(String s) {
        int result = 0;
        int n = 26;

        for (int i = 0; i < s.length(); i++) {
            result += (s.charAt(i) - '@') * Math.pow(n, s.length() - i - 1);
        }

        return result;
    }
}
// https://leetcode.com/problems/excel-sheet-column-number/