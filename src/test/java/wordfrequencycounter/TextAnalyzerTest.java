package wordfrequencycounter;

import exceptions.ParagraphIsEmptyException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class TextAnalyzerTest {
    TextAnalyzer textAnalyzer;
    List<String> wordCount;
    String paragraph;


    @BeforeEach
    void init() {
        WordCounter wordCounter = new WordCounter();
        WordSorter wordSorter = new WordSorter();
        textAnalyzer = new TextAnalyzer(wordCounter,wordSorter);
        wordCount = new ArrayList<>();
        paragraph = "samuel and favour were eating and favour pickedup the plate of food and disposed it and samuel got angry and slap him on his head";
    }

    @Test
    void wordCount() throws ParagraphIsEmptyException {
//        When
        Map<String, Integer> wordCount = textAnalyzer.wordCount(paragraph);

//        Then
        assertEquals(2, wordCount.get("samuel"));
    }

    @Test
    void wordCountException() throws ParagraphIsEmptyException {
//        Given
        String word = "";

//        Then
        assertThrows(ParagraphIsEmptyException.class, () -> {
            textAnalyzer.wordCount(word);
        });
    }

    @Test
    void wordSortedByFrequency() throws ParagraphIsEmptyException {

//        When
        List<String> actual = textAnalyzer.wordSortedByFrequency(paragraph);

//        Then
        assertEquals("and", actual.getFirst());
    }

    @Test
    void wordSortedFrequencyException() throws ParagraphIsEmptyException {
        //        Given
        String word = "";

//        Then
        assertThrows(ParagraphIsEmptyException.class, () -> {
            textAnalyzer.wordSortedByFrequency(word);
        });

    }

    @Test
    void wordSortedAlphabetically() throws ParagraphIsEmptyException {

//        When

        List<String> actual = textAnalyzer.wordSortedAlphabetically(paragraph);

//        Then

        assertEquals("and", actual.getFirst());
    }

    @Test
    void wordSortedAlphabeticallyException() throws ParagraphIsEmptyException {

        //        Given

        String word = "";

//      Then

        assertThrows(ParagraphIsEmptyException.class, () -> {
            textAnalyzer.wordSortedAlphabetically(word);
        });

    }
}