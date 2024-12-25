package org.example;

public class ClosestElement {
    /*
    Program to find the closest element to the target element provided
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 100, 300, 200, 400};
        int target = 130;
        int closest = arr[0];
        int smallestDiff = Math.abs(target - closest);

        for (int i : arr) {
            int currentDifference = Math.abs(target - i);
            if (currentDifference < smallestDiff) {
                smallestDiff = currentDifference;
                closest = i;
            }
        }
        System.out.println("The smallest difference is " + smallestDiff + " and the closest element is " + closest);
    }
}