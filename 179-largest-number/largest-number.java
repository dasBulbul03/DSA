class Solution {
    public String largestNumber(int[] nums) {
        // Step 1: Convert all numbers to strings
        String[] arr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        // Step 2: Sort using custom rule
        // Compare a+b and b+a to decide which should come first
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        // Step 3: Handle case where numbers are all zeros
        if (arr[0].equals("0")) {
            return "0";
        }

        // Step 4: Build final answer
        StringBuilder result = new StringBuilder();
        for (String s : arr) {
            result.append(s);
        }

        return result.toString();
    }
}