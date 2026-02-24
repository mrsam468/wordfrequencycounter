package wordfrequencycounter;

import exceptions.ParagraphIsEmptyException;

import java.util.*;

public class TextAnalyzer {
    private final WordCounter wordCounter;
    private final WordSorter wordSorter;
    public TextAnalyzer(WordCounter wordCounter,WordSorter wordSorter){
        this.wordCounter = wordCounter;
        this.wordSorter = wordSorter;
    }
    public Map<String, Integer> wordCount(String paragraph) throws ParagraphIsEmptyException {
        return wordCounter.wordCount(paragraph);
    }

    public List<String> wordSortedByFrequency(String paragraph) throws ParagraphIsEmptyException {
        return wordSorter.sortWordsByFrequency(paragraph);
    }

    public List<String> wordSortedAlphabetically(String paragraph) throws ParagraphIsEmptyException {
        return wordSorter.sortWordsAlphabetically(paragraph);
    }

}
