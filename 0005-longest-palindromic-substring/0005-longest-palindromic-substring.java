class Solution {
    int start=0;int end=0;
    public String longestPalindrome(String s) {
        for(int i=0;i<s.length();i++){
            int len1=expand(s,i,i+1);
            int len2=expand(s,i,i);
            int size=Math.max(len1,len2);
            if(end-start<size){
                start=i-(size-1)/2;
                end=i+size/2;
            }
        }
        return s.substring(start, end + 1);
    }
    int expand(String s, int i, int j){
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            i--;
            j++;
        }
        return j-i-1;
    }
}