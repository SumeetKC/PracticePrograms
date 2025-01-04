package org.programs.arrays;

public class RemoveSpecifiedDuplicateFromArray {

    /*
    Remove the duplicates of a specified element from the array
     */
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int result = removeElement(nums, 3);
    }

    public static int removeElement(int[] nums, int val) {
        if(nums.length == 0)
            return 0;

        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            if(nums[left] == val && nums[right] != val){
                nums[left] = nums[right];
                left++;
                right--;
            }else if(nums[right] == val){
                right--;
            }else{
                left++;
            }

        }

        return left;
    }
}
