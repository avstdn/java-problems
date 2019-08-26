package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an arbitrary ransom note string and another string containing letters
 * from all the magazines, write a function that will return true if the ransom
 * note can be constructed from the magazines ; otherwise, it will return false.
 * Each letter in the magazine string can only be used once in your ransom note.
 *
 * Note:
 * You may assume that both strings contain only lowercase letters.
 *
 * canConstruct("a", "b") -> false
 * canConstruct("aa", "ab") -> false
 * canConstruct("aa", "aab") -> true
 */
public class N383_Ransom_Note {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();

        for (char magazineLetter : magazine.toCharArray()) {
            map.put(magazineLetter, map.getOrDefault(magazineLetter, 0) + 1);
        }

        for (char ransomNoteLetter : ransomNote.toCharArray()) {
            if (map.containsKey(ransomNoteLetter) && map.get(ransomNoteLetter) > 0) {
                map.put(ransomNoteLetter, map.get(ransomNoteLetter) - 1);
            } else return false;
        }

        return true;
    }

    public boolean canConstructEfficient(String ransomNote, String magazine) {
        int[] table = new int[26];

        for (char c : magazine.toCharArray()) {
            table[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            if (--table[c - 'a'] < 0) return false;
        }

        return true;
    }
}
// https://leetcode.com/problems/ransom-note/