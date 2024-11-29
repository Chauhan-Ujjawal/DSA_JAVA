class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int Arraysum = Arrays.stream(arr).sum();
        if(Arraysum%3!=0) return false;
        int partition_sum=Arraysum/3;
        int temp_sum=0;
        int partition_no =0;
        for(int i=0;i<arr.length-1;i++){
            temp_sum+=arr[i];
            if(temp_sum==partition_sum){
                partition_no++;
                temp_sum=0;
            }
            if(partition_no==2) return true;
        }
        return false;
    }
}
