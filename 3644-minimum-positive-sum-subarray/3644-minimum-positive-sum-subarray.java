class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
    int minPositiveSum = Integer.MAX_VALUE;
    int n = nums.size();
        for (int i = 0; i < n; i++) {
            int currentSum = 0;
            for (int j = i; j < n; j++) {
                currentSum += nums.get(j);
                int len = j - i + 1;
                if (len >= l && len <= r && currentSum > 0) {
                    minPositiveSum = Math.min(minPositiveSum, currentSum);
                }
            }
        }
        return (minPositiveSum == Integer.MAX_VALUE) ? -1 : minPositiveSum;     
    }
}