class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(n!=1){
            int sum=0;
            while(n>0){
                int temp=n%10;
                sum+=temp*temp;
                n/=10;
            }
            n=sum;
            if(set.contains(sum)) return false;
            else set.add(sum);
        }
        return true;

    }
}