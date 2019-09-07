package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * You are given an array of strings words and a string chars. A string is good if it can be
 * formed by characters from chars (each character can only be used once). Return the sum of
 * lengths of all good strings in words.
 *
 * Example 1:
 * Input: words = ["cat","bt","hat","tree"], chars = "atach"
 * Output: 6
 * Explanation:
 * The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.
 *
 * Example 2:
 * Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"
 * Output: 10
 * Explanation:
 * The strings that can be formed are "hello" and "world" so the answer is 5 + 5 = 10.
 *
 * Note:
 * 1 <= words.length <= 1000
 * 1 <= words[i].length, chars.length <= 100
 * All strings contain lowercase English letters only.
 */

public class N1160_Find_Words_That_Can_Be_Formed_by_Characters {
    public int countCharacters(String[] words, String chars) {
        Map<Character, Integer> map = new HashMap<>();
        int count = 0;

        for (int i = 0; i < chars.length(); i++) {
            map.put(chars.charAt(i), map.getOrDefault(chars.charAt(i), 0) + 1);
        }

        for (String word : words) {
            Map<Character, Integer> temp = new HashMap<>(map);
            boolean canBeFormed = true;

            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);

                if (temp.getOrDefault(c, 0) > 0) {
                    temp.put(c, temp.get(c) - 1);
                } else {
                    canBeFormed = false;
                    break;
                }
            }

            if (canBeFormed) count += word.length();
        }

        return count;
    }
}
// https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/