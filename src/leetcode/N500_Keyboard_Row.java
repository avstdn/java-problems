package leetcode;

import java.util.ArrayList;
import java.util.List;

public class N500_Keyboard_Row {
    public String[] findWords(String[] words) {
        String[] rows = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        List<String> list = new ArrayList<>();

        for (String word : words) {
            int hits = 0;
            for (String row : rows) {
                for (char c : word.toCharArray()) {
                    if (row.indexOf(Character.toLowerCase(c)) >= 0) {
                        hits++;
                    } else break;
                }
            }
            if (hits == word.length()) {
                list.add(word);
            }
        }

        return list.toArray(new String[0]);
    }

    // public String[] findWords(String[] words) {
    //     return Stream.of(words).filter(s -> s.toLowerCase().matches("[qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*")).toArray(String[]::new);
    // }
}
// https://leetcode.com/problems/keyboard-row/