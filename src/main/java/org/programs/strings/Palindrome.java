package org.programs.strings;

public class Palindrome {
    public static void main(String[] args) {
        //String Palindrome or not

        String data = "test";
        if(isPalindrome(data))
            System.out.println("String is Palindrome");
        else
            System.out.println("String is not Palindrome");
    }

    private static boolean isPalindrome(String data) {

        char[] arr = data.toCharArray();
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            if(arr[start]!= arr[end])
                return false;

            start++;
            end--;
        }
    return true;
    }
}
