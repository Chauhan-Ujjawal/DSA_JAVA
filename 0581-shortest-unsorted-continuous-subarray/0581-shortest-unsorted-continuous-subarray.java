class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] sortedNums = nums.clone();  
        Arrays.sort(sortedNums); 
        int start = 0, end = nums.length - 1;
        while (start < nums.length && nums[start] == sortedNums[start]) {
            start++;
        }
        while (end > start && nums[end] == sortedNums[end]) {
            end--;
        }
        return end - start + 1;
    }
}