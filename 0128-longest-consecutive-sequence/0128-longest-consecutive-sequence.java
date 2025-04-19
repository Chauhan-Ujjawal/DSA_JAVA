class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        int count=1;
        int longeststreak=1; 
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            //skipping comman element 
            if(nums[i]==nums[i+1]) continue;
            else if(nums[i+1]-nums[i]==1) count++;
            else{
                longeststreak = Math.max(longeststreak,count);
                count=1;
            }
        }
        longeststreak = Math.max(longeststreak,count);
        return longeststreak;     
    }
}