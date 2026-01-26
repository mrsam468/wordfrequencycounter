package org.example;

import exceptions.ParagraphIsEmptyException;
import wordfrequencycounter.TextAnalyzer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        TextAnalyzer textAnalyzer = new TextAnalyzer();
        Scanner scanner = new Scanner(System.in);
        System.out.println("write down you sentence : ");
        String paragraph = scanner.nextLine();
        try {
            textAnalyzer.wordSortedAlphabetically(paragraph);
        } catch (ParagraphIsEmptyException e) {
            System.out.println(e.getMessage());
        }

    }
}
