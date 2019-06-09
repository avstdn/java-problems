package leetcode;

public class N344_Reverse_String {
    public void reverseString(char[] s) {
        reverse(s, 0, s.length-1);
    }

    public void reverse(char[] s, int begin, int end) {
        if (begin > end) return;
        char temp = s[begin];
        s[begin] = s[end];
        s[end] = temp;

        reverse(s, ++begin, --end);
    }
}
// https://leetcode.com/problems/reverse-string/