class Solution {
    public int maxProduct(int[] nums) {
        int prefix = 1;
        int suffix = 1;
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            // Calculate prefix product
            prefix *= nums[i];
            suffix *= nums[nums.length - i - 1];

            // Update maximum product
            maxi = Math.max(maxi, Math.max(prefix, suffix));

            // Reset prefix and suffix to 1 if zero is encountered
            if (prefix == 0) prefix = 1;
            if (suffix == 0) suffix = 1;
        }

        return maxi;
    }
}
