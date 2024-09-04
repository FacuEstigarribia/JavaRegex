package com.solvd.regex.task4;

public class BracketExtractorTest {

    public static void main(String[] args) {
        String input = "ignore me [extract:me] ignore me!";
        System.out.println(BracketExtractor.extractValueBetweenBrackets(input));
    }
}
