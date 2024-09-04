package com.solvd.regex.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmailValidatorTest {


    public static void main(String[] args) {
        List<String> inputs = Arrays.asList(
                "automation_20240903_a1b2c3@solvd.com",
                "automation_20240903_abc123@solvd.com",
                "automation_20240903_ab12cd@solvd.com",
                "automation_20240901_a1b2c3@solvd.com",
                "automation_20240903_a1b2c3@othercompany.com"
        );

        List<Boolean> booleanList = new ArrayList<>();
        for(String e : inputs){
            booleanList.add(EmailValidator.isValidEmail(e));
        }
        System.out.println("\nBoolean results for each input");
        booleanList.forEach(System.out::println);
    }

}
