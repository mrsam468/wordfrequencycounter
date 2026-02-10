package wordfrequencycounter;

import exceptions.ParagraphIsEmptyException;

import java.util.*;

public class TextAnalyzer {
    public Map<String,Integer> wordCount(String paragraph) throws ParagraphIsEmptyException {
        WordCounter wordCounter = new WordCounter();
        return wordCounter.wordCount(paragraph);
    }
    public List<String> wordSortedByFrequency(String paragraph) throws ParagraphIsEmptyException {
        WordSorter wordSorter = new WordSorter();
        return wordSorter.Frequency(paragraph);
    }
    public List<String> wordSortedAlphabetically(String paragraph) throws ParagraphIsEmptyException {
        WordSorter wordSorter = new WordSorter();
        return wordSorter.Alphabetical(paragraph);
    }

}
