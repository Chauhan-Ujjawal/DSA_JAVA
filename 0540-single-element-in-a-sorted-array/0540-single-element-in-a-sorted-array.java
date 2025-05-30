class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==1) return nums[0];
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mid==0 && nums[0]!=nums[1]) return nums[0];
            if(mid==nums.length-1 && nums[nums.length-1]!=nums[nums.length-2]) return nums[nums.length-1];
            if( nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1]) return nums[mid];
            if(mid%2==0){
                if(nums[mid]==nums[mid-1]) high=mid-1;
                else low=mid+1;
            }
            else{
                if(nums[mid]==nums[mid-1]) low=mid+1;
                else high=mid-1;
            }
        }
        return -1;        
    }
}