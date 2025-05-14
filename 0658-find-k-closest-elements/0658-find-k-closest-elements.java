class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int left=0;
        int right=arr.length-1;
        while(right-left+1>k){
            if(Math.abs(x-arr[left])<=Math.abs(arr[right]-x)) right--;
            else left++;
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=left;i<=right;i++){
            list.add(arr[i]);
        }
        return list;
    }
}
