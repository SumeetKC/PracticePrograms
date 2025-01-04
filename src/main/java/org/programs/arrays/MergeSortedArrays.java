package org.programs.arrays;

public class MergeSortedArrays {

    //Program to merge two sorted arrays into a single sorted array.
    public static void main(String[] args) {

        int[] arr1 = {5, 15, 25, 35, 45};
        int[] arr2 = {10, 20, 30, 40, 50};
        int[] result = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while(i < arr1.length && j < arr2.length){
            if(arr1[i] <= arr2[j]){
                result[k++] = arr1[i++];
            }else {
                result[k++] = arr2[j++];
            }
        }

        // Copy remaining elements of arr1
        if (i < arr1.length) {
            result[k] = arr1[i];
        }

        // Copy remaining elements of arr2
        if (j < arr2.length) {
            result[k] = arr2[j];
        }

        for (int i1 : result) {
            System.out.println("Elements are "+ i1);
        }
    }
}
