class Solution {
    public int findPeakElement(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            boolean leftCheck = (i == 0) || (nums[i] > nums[i - 1]);
            boolean rightCheck = (i == nums.length - 1) || (nums[i] > nums[i + 1]);
            
            if (leftCheck && rightCheck) {
                return i;
            }
        }
        return -1; // Shouldn't reach here for a valid input
    }
}
