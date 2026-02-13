package wordfrequencycounter;

import exceptions.ParagraphIsEmptyException;

import java.util.*;

public class WordCounter {

    protected Map<String, Integer> wordCount(String paragraph) throws ParagraphIsEmptyException {
        if (paragraph.isEmpty()) {
            throw new ParagraphIsEmptyException("please send in a valid paragraph");
        }
        String organisedString = paragraph.replaceAll("\\p{Punct}", "");
        String[] wordArr = organisedString.split("\\s+");
        List<String> words = new ArrayList<>(List.of(wordArr));
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }

        }
        return wordCount;
    }
}
