class Solution {
    public int findUnsortedSubarray(int[] nums) {
        Stack<Integer> stack= new Stack<>();
        int left=nums.length;
        for(int i=0;i<nums.length;i++){
            while(!stack.isEmpty() && nums[i]<nums[stack.peek()]){
                //this is to take starting point of unsorted subarray
                //only the most minimum point will be the starting point
                //Math.min to avoid any ups or down within the sub array
                left=Math.min(left,stack.pop());
            }
            stack.push(i);
        }
        stack.clear();
        int right=0;
        for(int i=nums.length-1;i>=0;i--){
            while(!stack.isEmpty() && nums[i]>nums[stack.peek()]){
                //taking the ending point of unsorted array
                //taking only the rightmost point 
                right=Math.max(right,stack.pop());
            }
            stack.push(i);
        }
        if(right>left){
            return right-left+1;
        }
        else{
            return 0;
        }
    }
}