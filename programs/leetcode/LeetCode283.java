package programs.leetcode;

/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.

Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Example 2:
Input: nums = [0]
Output: [0]

Constraints:
1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1

Follow up: Could you minimize the total number of operations done?
 */

public class LeetCode283 {
    public static void main(String[] args) {
        int [] nums = {1,2,0,1,0,2,1,5,0,0,7,1,0,0};
        System.out.print("Input:");
        Solution s = new Solution();
        s.printArray(nums);
        s.moveZeroes(nums);

    }
}

class Solution {
    public void moveZeroes(int[] nums) {
        int start=0;
        for(int i=0;i<nums.length;i++){
            if (nums[i]!=0){
                nums[start]=nums[i];
                start++;
            }
        }
        for(int i=start;i<nums.length;i++){
            nums[i]=0;
        }
        System.out.println("length:"+nums.length);
        System.out.print("Out:");
        printArray(nums);
    }
    public void printArray(int [] nums){
        for (int num : nums) {
            System.out.print(num + ",");
        }
    }
}