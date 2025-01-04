package org.programs.arrays;

import java.util.Arrays;
import java.util.TreeSet;

public class SecondLargestNumberArray {

    public static void main(String[] args) {
        secondLargestNumber();
    }

    private static void secondLargestNumber() {
        //The second-highest element from an array
        int[] arr = new int[]{23, 45, 67, 32, 65};
        int num = Arrays.stream(arr).distinct().sorted().skip(arr.length-2).findFirst().orElseThrow();
        System.out.println("Second Largest number is : " + num);

        TreeSet<Integer> set = new TreeSet<>();
        for (int i : arr) {
            set.add(i);
        }
        int secondLargestElement = set.stream().skip(arr.length - 2).findFirst().get();
        System.out.println("Second Largest element using set " + secondLargestElement);

        int[] arr1 = new int[]{23, 45, 67, 32, 65};
        int largest = 0;
        int secondLargest = 0;
        for (int i : arr1) {
            if(i > largest){
                secondLargest = largest;
                largest = i;
            }
            if(i< largest && i> secondLargest)
                secondLargest = i;
        }

        System.out.println("Second Largest element using loops " + secondLargest);
    }
}
