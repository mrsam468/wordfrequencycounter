package wordfrequencycounter;

import exceptions.ParagraphIsEmptyException;

import java.util.*;

public class TextAnalyzer {

    private static List<String> addToParagraphList(String paragraph) throws ParagraphIsEmptyException {
        List<String> paragraphList = new ArrayList<>();
        if (paragraph.isEmpty()) {
            throw new ParagraphIsEmptyException("please enter a valid sentence");
        }
        String organisedString = paragraph.replaceAll("\\p{Punct}", "");
        String[] wordArr = organisedString.split("\\s+");

        paragraphList.addAll(Arrays.asList(wordArr));
        return paragraphList;
    }


    public Map<String, Integer> wordCount(String paragraph) throws ParagraphIsEmptyException {
        List<String> wordArray = addToParagraphList(paragraph);
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : wordArray) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        return wordCount;
    }

    public List<String> wordSortedInFrequency(String paragraph) throws ParagraphIsEmptyException {
        TextAnalyzer wordCount = new TextAnalyzer();
        Map<String, Integer> words = wordCount.wordCount(paragraph);
        List<Map.Entry<String, Integer>> sortedMap = words.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).toList();
        List<String> wordSortedByFrequency = new ArrayList<>();
        sortedMap.forEach(entry -> wordSortedByFrequency.add(entry.getKey()));
        return wordSortedByFrequency;
    }

    public List<String> wordSortedAlphabetically(String paragraph) throws ParagraphIsEmptyException {
        TextAnalyzer wordCount = new TextAnalyzer();
        Map<String, Integer> words = wordCount.wordCount(paragraph);
        List<String> wordSortedAlphabeticallyList = new ArrayList<>();
        wordSortedAlphabeticallyList.addAll(words.keySet());
        Collections.sort(wordSortedAlphabeticallyList);
        return wordSortedAlphabeticallyList;
    }
}
