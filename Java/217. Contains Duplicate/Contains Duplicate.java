//https://leetcode.com/problems/contains-duplicate/

class Solution {
    
    public boolean containsDuplicate(int[] nums) {
        if (nums.length <= 1) {
            return false;
        }
        
        HashSet<Integer> hs = new HashSet<Integer>();

        for (int num : nums) {
            if (!hs.add(num)) {
                return true;
            }    
        }

        return false;
    }
}
