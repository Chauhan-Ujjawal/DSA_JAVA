class Solution {
    public String smallestSubsequence(String s) {
        int[] lastIndex =new int[26];
        StringBuilder result = new StringBuilder();
        boolean[] isPresent = new boolean[26];
        Arrays.fill(lastIndex,-1);
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            lastIndex[ch-'a']=i;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int index=ch-'a';
            if(isPresent[index]) continue;
            while(result.length()>0 && ch<result.charAt(result.length()-1) && lastIndex[result.charAt(result.length() - 1) - 'a'] > i){
                isPresent[result.charAt(result.length()-1)-'a']=false;
                result.deleteCharAt(result.length()-1);
            }
            result.append(ch);
            isPresent[index]=true;
        }
        return  result.toString();
    }
}