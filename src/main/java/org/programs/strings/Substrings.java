package org.programs.strings;

public class Substrings {
    public static void main(String[] args) {
        String text = "ABCD";

        /**Time complexity: O(N3), where N is the length of the input string
         Auxiliary Space: O(1)- */
        threeNestedLoops(text);

        /** Time complexity: O(N2), where N is the length of the input string.
         Auxiliary Space: O(N), where N is the length of the input string. */
        twoNestedLoops(text);
    }

    public static void threeNestedLoops(String data) {

        // outermost for loop for the selection of starting point
        for (int i = 0; i < data.length(); i++) {

            // 2nd for loop is for selection of ending point
            for (int j = i; j < data.length(); j++) {

                // 3rd loop is for printing from starting point to ending point
                for (int k = i; k <= j; k++) {
                    System.out.print(data.charAt(k));
                }
                // changing the line after printing
                // from starting point to ending point
                System.out.println();
            }
        }
    }

    public static void twoNestedLoops(String data) {

        // outermost for loop for the selection of starting point
        for (int i = 0; i < data.length(); i++) {
                String subStr = "";
            // 2nd for loop is for selection of ending point
            for (int j = i; j < data.length(); j++) {
                subStr += data.charAt(j);
                System.out.println(subStr);
            }
        }
    }
}
