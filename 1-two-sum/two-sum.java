class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store number → index
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];  // The number we need to find
            
            // If complement exists in map, return both indices
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            
            // Otherwise, store the current number and its index
            map.put(nums[i], i);
        }
        
        // If no pair found (though problem says one always exists)
        return new int[] {};
    }
}