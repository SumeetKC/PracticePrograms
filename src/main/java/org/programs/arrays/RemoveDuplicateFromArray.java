package org.programs.arrays;

import java.util.*;

public class RemoveDuplicateFromArray {

    //Program to remove duplicate elements from an array
    public static void main(String[] args) {

        int[] arr = {10, 10, 30, 20, 20, 40};
        // Using Set - complexity -> time - O(n) and space - O(n)
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        int[] result = set.stream().mapToInt(Integer::intValue).toArray();
        for (int i : result) {
            System.out.println("Using Set " + i);
        }

        //Using Streams
       int[] streamResult =  Arrays.stream(arr).distinct().toArray();
        for (int i : streamResult) {
            System.out.println("Using Streams " + i);
        }

        // Using Map
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, true);
        }

        int[] mapResult = map.keySet().stream().mapToInt(Integer::intValue).toArray();
        for (int i : mapResult) {
            System.out.println("Using Map : " + i);
        }

        // Using for loop and temp array
        int[] temp = new int[arr.length];
        int j = 0;

        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i+1])
                temp[j++] = arr[i];
        }
        temp[j++] = arr[arr.length - 1];

        int[] resultArr = Arrays.copyOf(temp, j);
        for (int i : resultArr) {
            System.out.println("Using loop : " + i);
        }
    }
}
