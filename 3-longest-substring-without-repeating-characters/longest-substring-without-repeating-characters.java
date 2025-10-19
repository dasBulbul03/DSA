class Solution {
    public int lengthOfLongestSubstring(String s) {
         Set<Character> set = new HashSet<>();
        int left = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            // If character already exists, shrink the window from the left
            while (set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
            }

            // Add the current character
            set.add(ch);

            // Update max length
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
    }
