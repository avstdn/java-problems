package leetcode;

import java.util.HashMap;
import java.util.Map;

public class N387_First_Unique_Character_in_a_String {
    public int firstUniqChar(String s) {
        Map<Character, Integer> charsMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            charsMap.put(s.charAt(i), charsMap.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (charsMap.get(s.charAt(i)) == 1) return i;
        }

        return -1;
    }

    public int firstUniqCharEfficient(String s) {
        int[] chars = new int[26];

        for(int i = 0; i < s.length(); i ++) {
            chars[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < s.length(); i ++) {
            if (chars[s.charAt(i) - 'a'] == 1) return i;
        }

        return -1;
    }
}
// https://leetcode.com/problems/first-unique-character-in-a-string/