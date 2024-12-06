class NumArray {
    int[] Sum = null;

    public NumArray(int[] nums) {
        // Initialize the Sum array with the same length as nums
        Sum = new int[nums.length];
        // Populate the Sum array with prefix sums
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                Sum[i] = nums[i]; // First element is the same
            } else {
                Sum[i] = nums[i] + Sum[i - 1]; // Cumulative sum
            }
        }        
    }
    
    public int sumRange(int left, int right) {
        if (left == 0) {
            return Sum[right]; // If left is 0, return sum up to right
        } else {
            return Sum[right] - Sum[left - 1]; // Subtract the prefix sum before left
        }
    }
}
