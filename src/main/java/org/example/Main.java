package org.example;

import exceptions.ParagraphIsEmptyException;
import wordfrequencycounter.TextAnalyzer;
import wordfrequencycounter.WordCounter;
import wordfrequencycounter.WordSorter;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WordCounter wordCounter = new WordCounter();
        WordSorter wordSorter = new WordSorter();
        TextAnalyzer textAnalyzer = new TextAnalyzer(wordCounter ,wordSorter);
        Scanner scanner = new Scanner(System.in);
        String paragraph = scanner.nextLine();
        try {
            textAnalyzer.wordSortedByFrequency(paragraph);
        } catch (ParagraphIsEmptyException e) {
            System.out.println("please enter a valid paragraph");
        }
        try {
            textAnalyzer.wordCount(paragraph);
        } catch (ParagraphIsEmptyException e) {
            System.out.println("please enter a valid paragraph");
        }
        try {
            textAnalyzer.wordSortedByFrequency(paragraph);
        } catch (ParagraphIsEmptyException e) {
            System.out.println("please enter a valid paragraph");
        }
    }
}
