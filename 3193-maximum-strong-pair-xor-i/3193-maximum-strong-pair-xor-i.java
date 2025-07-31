class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int maxXor = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    int a = nums[i], b = nums[j];
                    if (Math.abs(a - b) <= Math.min(a, b)) {
                        maxXor = Math.max(maxXor, a ^ b);
                    }
                }
            }
        }
        return maxXor;
    }
}
