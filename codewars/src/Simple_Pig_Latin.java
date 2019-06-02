public class Simple_Pig_Latin {
    public static String pigIt(String str) {
        String[] words = str.split(" ");
        String punctuations = ".,:;!?";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (!punctuations.contains(word)) {
                words[i] = word.substring(1, word.length()) + word.charAt(0) + "ay";
            }
        }

        return String.join(" ", words);
    }
}
// https://www.codewars.com/kata/520b9d2ad5c005041100000f