class Solution {
    public int pivotIndex(int[] nums) {
        int Rsum = Arrays.stream(nums).sum();
        int Lsum=0;
        for(int i=0;i<nums.length;i++){
            Rsum-=nums[i];            
            if(Rsum==Lsum) return i;
            Lsum+=nums[i];                       
        }
        return -1;

        
    }
}