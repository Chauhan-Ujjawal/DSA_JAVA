class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=0;
        for(int i=0;i<flowerbed.length;i++){
            if(n==0) return true;
            else if(flowerbed[i]==1) continue;
            else if(flowerbed[i]==0 && (i==0 || flowerbed[i-1]==0) && (i==flowerbed.length-1 || flowerbed[i+1]==0)){
                flowerbed[i]=1;
                count++;
                if(count==n) return true;
                
            }
        }
        return false;
        
    }
}