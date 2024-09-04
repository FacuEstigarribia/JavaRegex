package com.solvd.regex.task5;

public class GroupRepeatingCharacters {

    public static String groupRepeatingChars(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        char previousChar = input.charAt(0);
        result.append(previousChar);

        for (int i = 1; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar != previousChar) {
                result.append(currentChar);
                previousChar = currentChar;
            }
        }
        return result.toString();
    }
}
