class Solution {
    static int minkadane(int nums[]){
        int sum=nums[0];
        int minsum=nums[0];
        for(int i=1;i<nums.length;i++){
            sum=Math.min(sum+nums[i],nums[i]);
            minsum=Math.min(minsum,sum);
        }
        return minsum;       
    }
    static int maxkadane(int nums[]){
        //if the maximum sum subarray lies within the array instead of circular sub array 
        int sum=nums[0];
        int maxsum=nums[0];
        for(int i=1;i<nums.length;i++){
            sum=Math.max(sum+nums[i],nums[i]);
            maxsum=Math.max(maxsum,sum);
        }
        return maxsum;       
    }
    public int maxSubarraySumCircular(int[] nums) {
        int sum1=0;
        for(int i=0;i<nums.length;i++){
            sum1+=nums[i];
        }
        int minsum=minkadane(nums);
        int maxsum=maxkadane(nums);
        int circularsum=sum1-minsum;
        if(maxsum>0){
            return Math.max(circularsum,maxsum);
        }
        return maxsum;        
    }
}