package org.programs.arrays;

public class CheckArraySortedOrNot {
    //Program to check if an array is sorted in ascending order.
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 30};
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] <= arr[i+1]){
                continue;
            }else {
                System.out.println("Array not sorted ");
                break;
            }
        }
    }
}
