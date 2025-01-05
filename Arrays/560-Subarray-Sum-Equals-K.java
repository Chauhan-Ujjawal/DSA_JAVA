class Solution {
    public int subarraySum(int[] nums, int k) {
        int cnt = 0; // Number of subarrays:

        for (int i = 0 ; i < nums.length; i++) { // starting index i
            int sum = 0;
            for (int j = i; j < nums.length; j++) { // ending index j
                // calculate the sum of subarray [i...j]
                // sum of [i..j-1] + arr[j]
                sum += nums[j];

                // Increase the count if sum == k:
                if (sum == k)
                    cnt++;
            }
        }
      return cnt;
    }
}
