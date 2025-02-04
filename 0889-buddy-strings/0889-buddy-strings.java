class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        int i=0;
        int j=0;
        int count=0;
        if(s.equals(goal)){
            int[] freq = new int[26];
            int k=0;
            while(i<s.length()){
                char c=s.charAt(i);
                freq[c-'a']++;
                if (freq[c - 'a'] > 1) return true; 
                i++;
            }
            return false;
        }
        int first=-1; int second=-1;
        while(i<s.length()){
            if(s.charAt(i)!=goal.charAt(i)){
                count++;
                if(count>2) return false;
                if(first==-1){
                    first=i;
                }else{
                    second=i;
                }
            }
            i++; 
        }
        return count==2 && s.charAt(first)==goal.charAt(second) && s.charAt(second)==goal.charAt(first);
    }
}