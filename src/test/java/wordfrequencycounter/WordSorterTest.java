package wordfrequencycounter;

import exceptions.ParagraphIsEmptyException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordSorterTest {
    WordSorter wordSorter;
    String paragraph;
    @BeforeEach
    void init(){
        wordSorter = new WordSorter();
        paragraph = "samuel and favour were eating and favour pickedup the plate of food and disposed it and samuel got angry and slap him on his head";
    }
    @Test
    void sortWordsByFrequency() throws ParagraphIsEmptyException {
        //        When
        List<String> actual = wordSorter.sortWordsByFrequency(paragraph);

//        Then
        assertEquals("and", actual.getFirst());
    }

    @Test
    void wordSortedFrequencyException() throws ParagraphIsEmptyException {
        //        Given
        String word = "";

//        Then
        assertThrows(ParagraphIsEmptyException.class, () -> {
            wordSorter.sortWordsByFrequency(word);
        });

    }

    @Test
    void sortWordsAlphabetically() throws ParagraphIsEmptyException {
//                When

        List<String> actual = wordSorter.sortWordsAlphabetically(paragraph);

//        Then

        assertEquals("and", actual.getFirst());
    }

    @Test
    void wordSortedAlphabeticallyException() throws ParagraphIsEmptyException {

        //        Given

        String word = "";

//      Then

        assertThrows(ParagraphIsEmptyException.class, () -> {
            wordSorter.sortWordsAlphabetically(word);
        });

    }
}