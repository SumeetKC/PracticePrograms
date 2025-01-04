package org.programs.arrays;

import java.util.Arrays;

public class AverageArray {

    // WAP to find average of all the elements in an array
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50, 55};
        double sum = 0;
        //Using Streams
        double avg = Arrays.stream(arr).average().getAsDouble();
        System.out.println("The average of elements is " + avg);

        for (int i : arr) {
            sum += i;
        }
        double average = Double.valueOf(sum / arr.length);
        System.out.println("The average of elements is " + average);
    }
}
