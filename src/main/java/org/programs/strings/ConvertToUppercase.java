package org.programs.strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ConvertToUppercase {
    // Convert the first letter of each word in a string to uppercase.
    public static void main(String[] args) {
        String test = "writing program for conversion";
        String result = Arrays.stream(test.split(" "))
                .map(x -> x.substring(0,1).toUpperCase() + x.substring(1)).collect(Collectors.joining(" "));
        System.out.println(result);
    }
}
