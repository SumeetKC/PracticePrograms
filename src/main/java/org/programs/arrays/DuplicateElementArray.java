package org.programs.arrays;

import java.util.HashSet;

public class DuplicateElementArray {

    //Java program to return an array of duplicate elements present in a given array
    public static void main(String[] args) {
        int[] arr = {4,4,6,8,8,5,9};
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int i : arr){
            if(!set1.add(i))
                set2.add(i);
        }

        int[] arr2 = new int[set2.size()];
        int index = 0;
        for (int i : set2) {
            arr2[index++] = i;
            System.out.println(i);
        }
    }

}
