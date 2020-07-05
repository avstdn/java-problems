package leetcode;

/**
 * Given a string s, the power of the string is the maximum length of a non-empty substring
 * that contains only one unique character.
 * Return the power of the string.
 *
 * Example 1:
 * Input: s = "leetcode"
 * Output: 2
 * Explanation: The substring "ee" is of length 2 with the character 'e' only.
 *
 * Example 2:
 * Input: s = "abbcccddddeeeeedcba"
 * Output: 5
 * Explanation: The substring "eeeee" is of length 5 with the character 'e' only.
 *
 * Example 3:
 * Input: s = "triplepillooooow"
 * Output: 5
 *
 * Example 4:
 * Input: s = "hooraaaaaaaaaaay"
 * Output: 11
 *
 * Example 5:
 * Input: s = "tourist"
 * Output: 1
 *
 * Constraints:
 * 1 <= s.length <= 500
 * s contains only lowercase English letters.
 */
public class N1446_Consecutive_Characters {
    public int maxPower(String s) {
        int maxPower = 1;
        int powerCount = 1;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                powerCount++;
            } else {
                powerCount = 1;
            }

            maxPower = Math.max(maxPower, powerCount);
        }

        return maxPower;
    }
}
