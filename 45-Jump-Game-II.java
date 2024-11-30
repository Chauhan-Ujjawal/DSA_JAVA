class Solution {
    public int jump(int[] nums) {
        int totaljumps=0 , maxdistance=0 ,lastjumpindex=0;
        if(nums.length==1) return 0;
        for(int i=0;i<nums.length-1;i++){
            maxdistance=Math.max(maxdistance,i+nums[i]);
            if(i==lastjumpindex){
                lastjumpindex=maxdistance;
                totaljumps++;
            }
        }
        return totaljumps;     
    }
}
