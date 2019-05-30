import java.util.HashSet;

public class N804_Unique_Morse_Code_Words {
    public int uniqueMorseRepresentations(String[] words) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> hs = new HashSet();

        for (String str : words) {
            StringBuilder word = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                word.append(morse[alphabet.indexOf(str.charAt(i))]);
            }
            hs.add(word.toString());
        }
        return hs.size();
    }
}
// https://leetcode.com/problems/unique-morse-code-words/