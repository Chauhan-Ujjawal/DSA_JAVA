
class Solution {
    public long countGood(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        int n = nums.length;
        int left = 0;
        long result = 0;
        long pairCount = 0;
        for (int right = 0; right < n; right++) {
            pairCount += freq.getOrDefault(nums[right], 0);
            freq.put(nums[right], freq.getOrDefault(nums[right], 0) + 1);
            while (pairCount >= k) {
                result += n - right;
                int leftVal = nums[left];
                freq.put(leftVal, freq.get(leftVal) - 1);
                pairCount -= freq.get(leftVal);
                left++;
            }
        }
        return result;
    }
}
