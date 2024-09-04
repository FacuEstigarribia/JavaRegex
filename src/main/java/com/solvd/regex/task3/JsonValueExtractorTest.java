package com.solvd.regex.task3;

public class JsonValueExtractorTest {
    public static void main(String[] args) {
        // Example input
        String json = "{\"key1\": 11, \"key2\": 'asd', \"key3\": 342}";
        String keyToExtract = "key3";

        // Extract and print the value
        String value = JsonValueExtractor.extractValue(json, keyToExtract);
        System.out.println(value); // Output: 342
    }

}
