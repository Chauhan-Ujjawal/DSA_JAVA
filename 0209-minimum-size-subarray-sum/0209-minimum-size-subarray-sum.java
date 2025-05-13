class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int mini=Integer.MAX_VALUE;
        int currentsum=0;
        int low=0;
        int high=0;
        while(high<nums.length){
            currentsum+=nums[high];
            high++;
            while(currentsum>=target){
                int wheight=high-low;
                mini=Math.min(wheight,mini);
                currentsum-=nums[low];
                low++;
            }
        }
        return mini == Integer.MAX_VALUE ? 0 : mini;
    }
}