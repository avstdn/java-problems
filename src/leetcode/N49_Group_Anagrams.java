package leetcode;

import java.util.*;

/**
 * Given an array of strings, group anagrams together.
 *
 * Example:
 * Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
 * Output:
 * [
 *   ["ate","eat","tea"],
 *   ["nat","tan"],
 *   ["bat"]
 * ]
 *
 * Note:
 * All inputs will be in lowercase.
 * The order of your output does not matter.
 */

public class N49_Group_Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);

            if (!map.containsKey(sortedStr)) map.put(sortedStr, new ArrayList<>());

            map.get(sortedStr).add(str);
        }

        return new ArrayList<>(map.values());
    }

    public static Map<Character, Integer> getMap(String str) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }

        return map;
    }
}
// https://leetcode.com/problems/group-anagrams/submissions/