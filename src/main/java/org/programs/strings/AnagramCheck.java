package org.programs.strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class AnagramCheck {

    //Program to check whether two strings are anagram or not

    public static void main(String[] args) {
        String listen = "listen please 1";
        String silent = "silent please 1";

        String s1 = listen.chars().sorted().mapToObj(c -> String.valueOf((char)c)).collect(Collectors.joining());
        String s2 = silent.chars().sorted().mapToObj(c -> String.valueOf((char)c)).collect(Collectors.joining());
        if(s1.equals(s2))
            System.out.println("Anagrams");

        //Using Hashmap - best solution due to O(n) time and space complexity
    }

    private static boolean sortingMethod(String listen, String silent) {
        char[] arr1 = listen.toCharArray();
        char[] arr2 = silent.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}
