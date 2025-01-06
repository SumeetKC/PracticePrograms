package org.programs.strings;

import java.util.HashMap;
import java.util.stream.Collectors;

public class CountCharacterOccurrence {
    // Program to find the occurrence of a specific character in a string.
    public static void main(String[] args) {
        String value = "aabccdddeeeee";
        HashMap<Character, Integer> map = new HashMap<>();
         for (char c : value.toCharArray()){
             map.put(c, map.getOrDefault(c, 0) + 1);
         }

         map.entrySet().forEach(x -> System.out.println(x.getKey() + " : " + x.getValue()));

         // Using Streams
        value.chars().mapToObj(c -> c).collect(Collectors.groupingBy(c -> c, Collectors.counting()))
        .entrySet().forEach(x -> System.out.println(x.getKey() + " : " + x.getValue()));
    }
}
