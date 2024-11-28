class Solution {
    public double findMaxAverage(int[] nums, int k) {
        //firstly calculating sum of first  k elements
        int sum=0; 
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double maxsum=sum;
        int startindex=0;
        int endindex=k;
        while(endindex<nums.length){
            sum=sum-nums[startindex];
            startindex++;
            sum=sum+nums[endindex];
            endindex++;
            maxsum=Math.max(sum,maxsum);           
        }
        return maxsum/k;
            
    }
}