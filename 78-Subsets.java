class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        //creating a list of list of integers to store our final answer 
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(),nums , 0);
        return res;        
    }
    private void backtrack(List<List<Integer>> res, List<Integer> temp , int[] nums ,int index){
        res.add(new ArrayList<>(temp));
        for(int i=index;i<nums.length;i++){
            temp.add(nums[i]);
            backtrack(res,temp,nums , i+1);
            temp.remove(temp.size()-1);
        }
    }
}