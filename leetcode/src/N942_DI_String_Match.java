public class N942_DI_String_Match {
    public int[] diStringMatch(String S) {
        int inc = 0;
        int dec = S.length();
        int[] result = new int[S.length() + 1];

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'I') {
                result[i] = inc;
                inc++;
                if (i == S.length() - 1) result[i+1] = inc;
            } else {
                result[i] = dec;
                dec--;
                if (i == S.length() - 1) result[i+1] = dec;
            }
        }

        return result;
    }
}
// https://leetcode.com/problems/di-string-match/