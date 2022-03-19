//https://leetcode.com/problems/two-sum/

class Solution {
    
    public int[] twoSum(int[] nums, int target) {
        if (nums.length == 2) {
            return new int[] {0, 1};
        }

        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(hm.containsKey(complement)) {
                return new int[] {hm.get(complement), i};
            } else {
                hm.put(nums[i], i);
            }
        }
        
        return new int[] {};
    }
}
