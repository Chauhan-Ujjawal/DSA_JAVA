class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0; // To keep track of the maximum count of consecutive 1s
        int count = 0;    // To count the current streak of 1s

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++; // Increase count if we see a 1
            } else {
                maxCount = Math.max(maxCount, count); // Update maxCount if we hit a 0
                count = 0; // Reset count for the next sequence
            }
        }
        
        // Final check to update maxCount in case the array ends with 1s
        maxCount = Math.max(maxCount, count);

        return maxCount;        
    }
}