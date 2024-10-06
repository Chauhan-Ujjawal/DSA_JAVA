class Solution {
    public int longestSubarray(int[] nums) {
        // Step 1: Find the maximum value in the array
        int maxVal = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > maxVal) {
                maxVal = num;
            }
        }

        // Step 2: Find the length of the longest subarray with the maximum value
        int longestLength = 0;
        int currentLength = 0;

        for (int num : nums) {
            if (num == maxVal) {
                currentLength++; // Increment current length if the number is maxVal
                longestLength = Math.max(longestLength, currentLength); // Update the longest length
            } else {
                currentLength = 0; // Reset the current length if the number is not maxVal
            }
        }

        return longestLength; // Return the length of the longest subarray with maximum bitwise AND
    }
}
