package leetcode;

import java.util.ArrayList;
import java.util.List;

public class N1002_Find_Common_Characters {
    public List<String> commonChars(String[] A) {
        List<String> list = new ArrayList<>();
        String unique = "";

        for (int i = 0; i < A[0].length(); i++) {
            if (unique.indexOf(A[0].charAt(i)) == -1) {
                unique = unique + A[0].charAt(i);
            }
        }

        for (char c : unique.toCharArray()) {
            int minCount = Integer.MAX_VALUE;

            for (String word : A) {
                int innerCount = 0;

                for (int i = 0; i < word.length(); i++) {
                    if (c == word.charAt(i) && minCount > innerCount) innerCount++;
                }
                minCount = innerCount;
            }

            while (minCount-- > 0) list.add(c + "");
        }

        return list;
    }
}
// https://leetcode.com/problems/find-common-characters/