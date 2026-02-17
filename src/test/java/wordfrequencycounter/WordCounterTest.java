package wordfrequencycounter;

import exceptions.ParagraphIsEmptyException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class WordCounterTest {
    WordCounter wordCounter;
    String paragraph;
    @BeforeEach
    void init(){
        wordCounter = new WordCounter();
        paragraph = "samuel and favour were eating and favour pickedup the plate of food and disposed it and samuel got angry and slap him on his head";
    }

    @Test
    void wordCount() throws ParagraphIsEmptyException {
        //        When
        Map<String, Integer> wordCount = wordCounter.wordCount(paragraph);

        //        Then
        assertEquals(2, wordCount.get("samuel"));
    }

    @Test
    void wordCountException() throws ParagraphIsEmptyException {
//        Given
        String word = "";

//        Then
        assertThrows(ParagraphIsEmptyException.class, () -> {
            wordCounter.wordCount(word);
        });
    }

}