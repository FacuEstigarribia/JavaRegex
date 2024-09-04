package com.solvd.regex.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
 /*
 Write a Java method that extracts phone numbers from a given text.

For example:
input: “Contact us at +1 (123) 456-7890 or 1-777-123-4567"
output: “11234567890”, “17771234567”
  */
public class ExtractPhoneNumbers {
    public static String[] extractPhoneNumbers(String text) {
        // regex pattern for various phone number formats
        String regex = "\\+?\\d{1,3}[\\s-]?\\(?\\d{1,4}\\)?[\\s-]?\\d{1,4}[\\s-]?\\d{1,4}[\\s-]?\\d{1,9}";

        // Compile the pattern
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // StringBuilder to collect formatted phone numbers
        StringBuilder phoneNumbers = new StringBuilder();

        // Find all matches and format them
        while (matcher.find()) {
            String number = matcher.group();
            // Remove all non-digit characters
            String formattedNumber = number.replaceAll("\\D", "");
            // Append the formatted number to the StringBuilder
            phoneNumbers.append(formattedNumber).append(",");
        }

        // Convert StringBuilder to array of strings
        String[] result = phoneNumbers.length() > 0
                ? phoneNumbers.toString().split(",")
                : new String[0];

        return result;
    }
}
