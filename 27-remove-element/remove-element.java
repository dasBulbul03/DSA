class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // pointer for next valid position

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {   // keep elements that are not equal to val
                nums[k] = nums[i];  // move them to front
                k++;                // move pointer forward
            }
        }

        return k; // number of elements not equal to val
    }
}
