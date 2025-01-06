package org.programs.strings;

public class PalindromeCheck {

    //Program to check if a string is a palindrome
    public static void main(String[] args) {

        String name = "abccbar";
        //Using StringBuilder
        StringBuilder builder = new StringBuilder(name);
        if(name.equals(builder.reverse()))
            System.out.println("String is palindrome");

        twoPointer(name);
    }

    private static boolean twoPointer(String name) {
        int i = 0;
        int j = name.length() - 1;
        while (i < j){
            if(name.charAt(i) != name.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
