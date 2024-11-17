class Solution {
    public int distributeCandies(int[] candyType) {
        int n=candyType.length/2;
        Set <Integer> candy =  new HashSet<>();
        for(int i=0;i<candyType.length;i++){
            candy.add(candyType[i]);
        }
        return Math.min(candy.size(),n);
        
    }
}