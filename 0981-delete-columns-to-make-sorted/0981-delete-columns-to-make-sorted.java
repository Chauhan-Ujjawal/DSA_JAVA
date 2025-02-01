class Solution {
    public int minDeletionSize(String[] strs) {
        int count=0;
        int n=strs.length; //no. of string in array = no. of rows
        int m=strs[0].length(); //length of each string = no. of column

        for(int i=0;i<m;i++){ //i==col
            for(int j=0;j<n-1;j++){ //j==row
                if(strs[j].charAt(i)>strs[j+1].charAt(i)){
                    count++;
                    break;
                }
            }
        }
        return count;
    
    }
}