package com.solvd.regex.task1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;

public class EmailValidator {

    public static boolean isValidEmail(String email) {

        LocalDate today = LocalDate.now();
        System.out.println("Today: " + today.toString());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");

        String currentDate = today.format(formatter);
        System.out.println("current date: " + currentDate);
        // Build the regex pattern
        String regex = String.format(
                "^automation_%s_[a-zA-Z0-9]{6}@solvd.com$",
                currentDate
        );

        // Compile the regex pattern
        Pattern pattern = Pattern.compile(regex);


        // Match the email against the pattern
        return pattern.matcher(email).matches();
    }
}
