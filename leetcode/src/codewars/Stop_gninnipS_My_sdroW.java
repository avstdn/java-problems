package codewars;

public class Stop_gninnipS_My_sdroW {
    public String spinWords(String sentence) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 4) {
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }
        return String.join(" ", words);
    }
}
// https://www.codewars.com/kata/5264d2b162488dc400000001
