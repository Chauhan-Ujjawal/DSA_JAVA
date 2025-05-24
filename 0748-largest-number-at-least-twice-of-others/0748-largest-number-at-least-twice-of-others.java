class Solution {
    public int dominantIndex(int[] nums) {
        int[] cloned = nums.clone();
        Arrays.sort(cloned);
        int max = cloned[nums.length - 1];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != max && nums[i] * 2 > max) {
                return -1;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == max) {
                return i;
            }
        }
        return -1;  
    }
}