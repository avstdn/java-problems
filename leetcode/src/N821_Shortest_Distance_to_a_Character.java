import java.util.ArrayList;
import java.util.List;

public class N821_Shortest_Distance_to_a_Character {
    public int[] shortestToChar(String S, char C) {
        List<Integer> list = new ArrayList<>();
        int[] result = new int[S.length()];

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == C) list.add(i);
        }

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == C) continue;
            int minLength = Integer.MAX_VALUE;

            for (Integer element : list) {
                int minAbs = Math.abs(i - element);
                if (minLength > minAbs) minLength = minAbs;
            }

            result[i] = minLength;
        }

        return result;
    }
}
// https://leetcode.com/problems/shortest-distance-to-a-character/
