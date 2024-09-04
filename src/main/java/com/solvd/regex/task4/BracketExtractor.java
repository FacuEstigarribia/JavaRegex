package com.solvd.regex.task4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BracketExtractor {
    public static String extractValueBetweenBrackets(String input) {
        // Define the regex pattern to match text between square brackets
        String regex = "\\[(.*?)\\]";


        Pattern pattern = Pattern.compile(regex);


        Matcher matcher = pattern.matcher(input);

        // Check if the pattern matches and extract the value
        if (matcher.find()) {
            // Return the first match found
            return matcher.group(1);
        }

        // Return null or an empty string if no match is found
        return null;
    }
}
