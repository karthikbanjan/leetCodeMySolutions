//https://leetcode.com/problems/squares-of-a-sorted-array/

class Solution {

    public int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        
        for (int i = 0, j = nums.length - 1, k = nums.length - 1; i <= j; k--) {
            if (Math.abs(nums[i]) > Math.abs(nums[j])) {
                arr[k] = nums[i] * nums[i];
                i++;
            } else {
                arr[k] = nums [j] * nums[j];
                j--;
            }
        }

        return arr;
    }
}
