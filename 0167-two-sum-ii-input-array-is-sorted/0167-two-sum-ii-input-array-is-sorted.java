class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int low=0;
        int high=numbers.length-1;
        int[] twosum=new int[2];
        while(low<=high){
            if(numbers[low]+numbers[high]==target){
                twosum[0]=low+1;
                twosum[1]=high+1;
                return twosum;
            }
            else if(numbers[low]+numbers[high]>target) high--;
            else low++;
        }
        return twosum;        
    }
}