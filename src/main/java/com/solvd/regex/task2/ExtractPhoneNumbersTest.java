package com.solvd.regex.task2;

public class ExtractPhoneNumbersTest {

    public static void main(String[] args) {
        String input = "Contact us at +1 (123) 456-7890 or 1-777-123-4567";
        String[] phoneNumbers = ExtractPhoneNumbers.extractPhoneNumbers(input);
        for (String number : phoneNumbers) {
            System.out.println(number);
        }
    }
}
