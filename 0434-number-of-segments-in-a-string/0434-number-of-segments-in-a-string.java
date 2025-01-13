class Solution {
    public int countSegments(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            if(!Character.isWhitespace(s.charAt(i)) && (i==0 || Character.isWhitespace(s.charAt(i-1)))) count++;
        }
        return count;
    }
}