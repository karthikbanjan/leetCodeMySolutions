//https://leetcode.com/problems/rotate-array/

class Solution {
    
    public void rotate(int[] nums, int k) {
        int l = nums.length;
        k %= l;

        reverse(nums, 0, l - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, l - 1);
    }
    
    public void reverse(int[] nums, int i, int j) {
        while (i < j) {
            nums[i] = nums[i] + nums[j];
            nums[j] = nums[i] - nums[j];
            nums[i] = nums[i++] - nums[j--];
        }
    }
}
