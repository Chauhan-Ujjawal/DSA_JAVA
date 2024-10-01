class Solution {
    public void moveZeroes(int[] nums) { // 0,0,1,3,12
        //ArrayList<Integer> list = new ArrayList <>();
        int pos=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[pos]=nums[i];
                pos++; 
            }
        }
        int n =nums.length-pos;//n=5-3=2
        while (pos < nums.length) {
            nums[pos] = 0; // Fill remaining positions with zeroes
            pos++;
        }
        System.out.print("[");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i < nums.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");


    }
}