

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(0, candidates, target, ans, new ArrayList<>(), 0);
        return ans;
    }

    public static void findCombinations(int index, int[] candidates, int target, List<List<Integer>> ans, ArrayList<Integer> list, int sum) {
        // base case
        if (index >= candidates.length) {
            if (sum == target) {
                ans.add(new ArrayList<>(list));
            }
            return;
        }

        // include current element and staying at same index
        if(sum+candidates[index]<=target){
            list.add(candidates[index]);
            findCombinations(index, candidates, target, ans, list, sum + candidates[index]);
             list.remove(list.size() - 1);
        }
        //excluding current element 
        findCombinations(index + 1, candidates, target, ans, list, sum);
    }
}
