class Solution {
    public int maximumGap(int[] nums) {
        int diff = Integer.MIN_VALUE;
        if(nums.length<2) return 0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            diff=Math.max(diff,Math.abs(nums[i]-nums[i+1]));
        }
        return diff;
        
    }
}