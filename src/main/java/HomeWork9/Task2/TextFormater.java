package HomeWork9.Task2;

import java.util.Arrays;
import java.util.List;

public class TextFormater {

    public static boolean ifWordIsPolindrom(List<String> words) {
        for (String word : words) {
            if (word.length() >= 2) {
                for (int i = 0; i < word.length() / 2; i++) {
                    if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static boolean LimetedSentence(List<String> words) {
        if (words.size() >= 3 && words.size() <= 5) {
            return true;
        }
        return false;
    }
}