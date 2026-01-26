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
        textAnalyzer = new TextAnalyzer();
        wordCount = new ArrayList<>();
        paragraph = "samuel and favour were eating and favour pickedup the plate of food and disposed it and samuel got angry and slap him on his head";
    }

    @org.junit.jupiter.api.Test
    void wordCount() throws ParagraphIsEmptyException {
//        Given
        Map<String, Integer> wordToBeChecked = new HashMap<>();
        String word = paragraph;

//        When
        wordToBeChecked.put("samuel", 2);
        wordToBeChecked.put("and", 5);
        wordToBeChecked.put("favour", 2);
        wordToBeChecked.put("were", 1);
        wordToBeChecked.put("eating", 1);
        wordToBeChecked.put("pickedup", 1);
        wordToBeChecked.put("the", 1);
        wordToBeChecked.put("plate", 1);
        wordToBeChecked.put("of", 1);
        wordToBeChecked.put("food", 1);
        wordToBeChecked.put("disposed", 1);
        wordToBeChecked.put("it", 1);
        wordToBeChecked.put("got", 1);
        wordToBeChecked.put("angry", 1);
        wordToBeChecked.put("slap", 1);
        wordToBeChecked.put("him", 1);
        wordToBeChecked.put("on", 1);
        wordToBeChecked.put("his", 1);
        wordToBeChecked.put("head", 1);

//        Then
        assertEquals(wordToBeChecked, textAnalyzer.wordCount(word));
    }

    @Test
    void wordCountException() throws ParagraphIsEmptyException {
//        Given
        Map<String, Integer> wordToBeChecked = new HashMap<>();
        String word = "";

//        When
        wordToBeChecked.put("samuel", 2);
        wordToBeChecked.put("and", 5);
        wordToBeChecked.put("favour", 2);
        wordToBeChecked.put("were", 1);
        wordToBeChecked.put("eating", 1);
        wordToBeChecked.put("pickedup", 1);
        wordToBeChecked.put("the", 1);
        wordToBeChecked.put("plate", 1);
        wordToBeChecked.put("of", 1);
        wordToBeChecked.put("food", 1);
        wordToBeChecked.put("disposed", 1);
        wordToBeChecked.put("it", 1);
        wordToBeChecked.put("got", 1);
        wordToBeChecked.put("angry", 1);
        wordToBeChecked.put("slap", 1);
        wordToBeChecked.put("him", 1);
        wordToBeChecked.put("on", 1);
        wordToBeChecked.put("his", 1);
        wordToBeChecked.put("head", 1);

//        Then
        assertThrows(ParagraphIsEmptyException.class, () -> {
            textAnalyzer.wordCount(word);
        });
    }

    @Test
    void wordSortedFrequency() throws ParagraphIsEmptyException {
//        Given
        String word = paragraph;

//        When
        wordCount.add("and");
        wordCount.add("favour");
        wordCount.add("samuel");
        wordCount.add("plate");
        wordCount.add("it");
        wordCount.add("angry");
        wordCount.add("eating");
        wordCount.add("got");
        wordCount.add("him");
        wordCount.add("food");
        wordCount.add("pickedup");
        wordCount.add("the");
        wordCount.add("head");
        wordCount.add("his");
        wordCount.add("were");
        wordCount.add("of");
        wordCount.add("disposed");
        wordCount.add("slap");
        wordCount.add("on");

//        Then
        assertEquals(wordCount, textAnalyzer.wordSortedFrequency(word));
    }

    @Test
    void wordSortedFrequencyException() throws ParagraphIsEmptyException {
        //        Given
        String word = "";

//        When
        wordCount.add("and");
        wordCount.add("favour");
        wordCount.add("samuel");
        wordCount.add("plate");
        wordCount.add("it");
        wordCount.add("angry");
        wordCount.add("eating");
        wordCount.add("got");
        wordCount.add("him");
        wordCount.add("food");
        wordCount.add("pickedup");
        wordCount.add("the");
        wordCount.add("head");
        wordCount.add("his");
        wordCount.add("were");
        wordCount.add("of");
        wordCount.add("disposed");
        wordCount.add("slap");
        wordCount.add("on");


//        Then
        assertThrows(ParagraphIsEmptyException.class, () -> {textAnalyzer.wordSortedFrequency(word);});

    }

    @org.junit.jupiter.api.Test
    void wordSortedAlphabetically() throws ParagraphIsEmptyException {

        String word = paragraph;

//        When
        wordCount.add("and");
        wordCount.add("favour");
        wordCount.add("samuel");
        wordCount.add("plate");
        wordCount.add("it");
        wordCount.add("angry");
        wordCount.add("eating");
        wordCount.add("got");
        wordCount.add("him");
        wordCount.add("food");
        wordCount.add("pickedup");
        wordCount.add("the");
        wordCount.add("head");
        wordCount.add("his");
        wordCount.add("were");
        wordCount.add("of");
        wordCount.add("disposed");
        wordCount.add("slap");
        wordCount.add("on");
        Collections.sort(wordCount);

//        Then
        assertEquals(wordCount, textAnalyzer.wordSortedAlphabetically(word));
    }
    @Test
    void wordSortedAlphabeticallyException () throws ParagraphIsEmptyException {
        //        Given
        String word = "";

//        When
        wordCount.add("and");
        wordCount.add("favour");
        wordCount.add("samuel");
        wordCount.add("plate");
        wordCount.add("it");
        wordCount.add("angry");
        wordCount.add("eating");
        wordCount.add("got");
        wordCount.add("him");
        wordCount.add("food");
        wordCount.add("pickedup");
        wordCount.add("the");
        wordCount.add("head");
        wordCount.add("his");
        wordCount.add("were");
        wordCount.add("of");
        wordCount.add("disposed");
        wordCount.add("slap");
        wordCount.add("on");


//        Then
        assertThrows(ParagraphIsEmptyException.class, () -> {textAnalyzer.wordSortedFrequency(word);});

    }
}