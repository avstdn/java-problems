package leetcode;

public class N771_Jewels_And_Stones {
    public int numJewelsInStones(String J, String S) {
        int hits = 0;

        for (char ch : J.toCharArray()) {
            for (int i = 0; i < S.length(); ++i) {
                if (ch == S.charAt(i)) ++hits;
            }
        }
        return hits;
    }
}
// https://leetcode.com/problems/jewels-and-stones/