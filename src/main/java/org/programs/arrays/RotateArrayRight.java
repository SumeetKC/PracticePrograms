package org.programs.arrays;

public class RotateArrayRight {

    // Program to rotate an array to right by K steps
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int k = 3;
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);

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
