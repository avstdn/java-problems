package leetcode;

import java.util.*;

/**
 * We are given two sentences A and B.  (A sentence is a string of space
 * separated words.  Each word consists only of lowercase letters.)
 * A word is uncommon if it appears exactly once in one of the sentences,
 * and does not appear in the other sentence.
 * Return a list of all uncommon words.
 * You may return the list in any order.
 *
 * Example 1:
 *
 * Input: A = "this apple is sweet", B = "this apple is sour"
 * Output: ["sweet","sour"]
 * Example 2:
 *
 * Input: A = "apple apple", B = "banana"
 * Output: ["banana"]
 */
public class N884_Uncommon_Words_from_Two_Sentences {
    public String[] uncommonFromSentences(String A, String B) {
        List<String> words = new ArrayList<>(Arrays.asList((A + " " + B).split(" ")));
        List<String> list = new ArrayList<>();

        for (String word : words) {
            if (Collections.frequency(words, word) == 1) list.add(word);
        }

        return list.toArray(new String[0]);
    }

//    public String[] uncommonFromSentences(String A, String B) {
//        Map<String, Integer> count = new HashMap<>();
//        for (String w : (A + " " + B).split(" "))
//            count.put(w, count.getOrDefault(w, 0) + 1);
//        ArrayList<String> res = new ArrayList<>();
//        for (String w : count.keySet())
//            if (count.get(w) == 1)
//                res.add(w);
//        return res.toArray(new String[0]);
//    }
}
// https://leetcode.com/problems/uncommon-words-from-two-sentences/