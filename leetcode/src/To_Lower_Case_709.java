public class To_Lower_Case_709 {
    public String toLowerCase(String str) {
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if ((chars[i] >= 'A') && (chars[i] <= 'Z')) {
                chars[i] = (char)(chars[i] ^ 0x20);
            }
        }
        return new String(chars);
    }
}
// https://leetcode.com/problems/to-lower-case/