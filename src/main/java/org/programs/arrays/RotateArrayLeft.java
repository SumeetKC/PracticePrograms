package org.programs.arrays;

public class RotateArrayLeft {

    // Program to rotate an array to left by K steps
    //Space complexity - O(1) and Time complexity - O(n)
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int k = 3;
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);

        for (int i : arr) {
            System.out.println("Array after rotation " + i);
        }

    }

    public static void reverse(int[] arr, int start, int end) {
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
