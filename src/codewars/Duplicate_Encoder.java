package codewars;

import java.util.*;

public class Duplicate_Encoder {
    static String encode(String word) {
        Map<Integer, String> last = new HashMap<>();
        String[] words = word.toLowerCase().split("");
        String[] result = new String[word.length()];
        List<String> exist = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (exist.contains(words[i])) continue;
            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    exist.add(words[j]);
                    last.put(j, words[j]);
                }
            }

            for (Map.Entry<Integer, String> entry : last.entrySet()) {
                if (last.size() > 1) {
                    result[entry.getKey()] = ")";
                } else {
                    result[entry.getKey()] = "(";
                }
            }
            last.clear();
        }

        return String.join("", result);
    }
}
// https://www.codewars.com/kata/54b42f9314d9229fd6000d9c
