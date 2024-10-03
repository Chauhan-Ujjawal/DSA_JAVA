class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        //[4,3,2,7,8,2,3,1]
        int n = nums.length ; //n=7 indexes =0,1,2,3,4,5,6,7
        ArrayList <Integer> result = new ArrayList <>(); 
        for(int i=0;i<nums.length;i++){
            int index = Math.abs(nums[i])-1;
            if(nums[index]>0){
                nums[index]=-nums[index];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                result.add(i+1);
            }
        }
        return result;       
    }
}