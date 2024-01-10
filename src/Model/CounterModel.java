package Model;

import java.util.HashMap;
import java.util.Map;

public class CounterModel {

    private Map<String, Integer> wordCounter;
    private Map<Character, Integer> charCounter;

    public CounterModel() {
        wordCounter = new HashMap<>();
        charCounter = new HashMap<>();
    }

    public void analyze(String content) {
        // Count words and characters
        String[] words = content.split("\\s+");
        for (String word : words) {
            wordCounter.put(word, wordCounter.getOrDefault(word, 0) + 1);

            // Count individual characters in each word
            for (char ch : word.toCharArray()) {
                charCounter.put(ch, charCounter.getOrDefault(ch, 0) + 1);
            }
        }
    }

    public Map<String, Integer> getWordCounter() {
        return wordCounter;
    }

    public Map<Character, Integer> getCharCounter() {
        return charCounter;
    }
}
