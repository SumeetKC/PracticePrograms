package org.programs.strings;

public class CheckDigits {
    // Program to check string contains only digits
    public static void main(String[] args) {
        String str = "123456";

        //Using Streams
        boolean result = str.chars().allMatch(Character::isDigit);

        //Using Exceptions
        if (exceptionApproach(str))
            System.out.println("String contain only digits");
        else
            System.out.println("String does not contain only digits");

    }

    private static boolean exceptionApproach(String str) {
        try {
            Long.parseLong(str);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    //Using Character isDigit
    private static boolean characterIsDigit(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c))
                return false;
        }
        return true;
    }
}
