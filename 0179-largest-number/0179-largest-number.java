class Solution {
    public String largestNumber(int[] nums) {
        String[] nums2 = new String[nums.length];
        for(int i=0;i<nums.length;i++){
            nums2[i]=String.valueOf(nums[i]);
        }
        //custom comparator
        Arrays.sort(nums2,(a,b)->(b+a).compareTo(a+b));
        if(nums2[0].equals("0")) return "0";
        StringBuilder sb = new StringBuilder();
        for (String num : nums2) {
            sb.append(num);
        }
        return sb.toString();
    }
}