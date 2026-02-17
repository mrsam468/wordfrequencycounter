package wordfrequencycounter;

import exceptions.ParagraphIsEmptyException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class WordSorter {
    WordCounter wordCounter = new WordCounter();

    public List<String> sortWordsByFrequency(String paragraph) throws ParagraphIsEmptyException {

        Map<String, Integer> wordCount = wordCounter.wordCount(paragraph);
        List<String> result = new ArrayList<>(wordCount.keySet());
        for (int i = 0; i < result.size(); i++) {
            for (int j = i + 1; j < result.size(); j++) {
                if (wordCount.get(result.get(i)) < wordCount.get(result.get(j))) {
                    String temp = result.get(j);
                    result.set(j, result.get(i));
                    result.set(i, temp);
                }
            }
        }
        return result;
    }


    public List<String> sortWordsAlphabetically(String paragraph) throws ParagraphIsEmptyException {
        Map<String, Integer> wordCount = wordCounter.wordCount(paragraph);
        List<String> result = new ArrayList<>(wordCount.keySet());
        for (int i = 0; i < result.size(); i++) {
            for (int j = i + 1; j < result.size(); j++) {
                if (result.get(i).compareToIgnoreCase(result.get(j)) > 0) {
                    String temp = result.get(j);
                    result.set(j, result.get(i));
                    result.set(i, temp);
                }
            }
        }
        return result;
    }
}