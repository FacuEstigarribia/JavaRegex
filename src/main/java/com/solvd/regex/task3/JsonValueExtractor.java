package com.solvd.regex.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JsonValueExtractor {

    public static String extractValue(String json, String keyToExtract) {
        // Define the regex pattern for key-value extraction
        String regex = String.format("\"%s\"\\s*:\\s*([^,}]+)", Pattern.quote(keyToExtract));

        // Compile the pattern
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(json);

        // Check if the pattern matches and extract the value
        if (matcher.find()) {
            // Extract the value and trim whitespace
            String value = matcher.group(1).trim();
            // Remove surrounding quotes if it's a string
            if (value.startsWith("'") && value.endsWith("'")) {
                value = value.substring(1, value.length() - 1);
            } else if (value.startsWith("\"") && value.endsWith("\"")) {
                value = value.substring(1, value.length() - 1);
            }
            return value;
        }

        // Return null or an appropriate message if the key is not found
        return null;
    }

}
