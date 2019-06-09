package leetcode;

public class N557_Reverse_Words_in_a_String_III {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();

        for (String word : s.split(" ")) {
            result.append(new StringBuilder(word).reverse()).append(" ");
        }

        return result.toString().trim();
    }
}
// https://leetcode.com/problems/reverse-words-in-a-string-iii/