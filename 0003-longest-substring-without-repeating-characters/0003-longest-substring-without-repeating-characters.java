class Solution {
    public int lengthOfLongestSubstring(String s) {
        int size=0;int left=0;int right=0;
        char[] arr=s.toCharArray();
        Map<Character,Integer> record=new HashMap<>();
        for(;right<arr.length;right++){
            int indx=record.getOrDefault(arr[right],-1);
//if character is already present in map it will return the index of that character
            if(indx!=-1 && indx>=left){
                size=Math.max(size,right-left);
                //updating left pointer
                left=indx+1;
            }
            //adding the charcater in our map if it's not in map
            record.put(arr[right],right);
        }
        return Math.max(size,right-left);
    }
}