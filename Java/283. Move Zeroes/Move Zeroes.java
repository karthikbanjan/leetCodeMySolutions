//https://leetcode.com/problems/move-zeroes/

class Solution {

    public void moveZeroes(int[] nums) {
        int j = 0;
        
        if (nums.length <= 1 || nums == null) {
            return;
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }
        
        for (; j < nums.length; j++) {
            nums[j] = 0;
        }
    }
}
