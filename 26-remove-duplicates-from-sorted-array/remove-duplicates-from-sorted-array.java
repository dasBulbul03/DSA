class Solution {
    public int removeDuplicates(int[] nums) {
        // If array has 0 or 1 element, it's already unique
        if (nums.length == 0) return 0;

        int k = 1; // pointer for the position of next unique element

        // Start from the second element and compare with previous one
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i]; // store unique element
                k++; // move pointer
            }
        }

        return k; // number of unique elements
    }
}
