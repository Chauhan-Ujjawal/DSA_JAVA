class Solution {
    public boolean closeStrings(String word1, String word2) {
        int[] arr1=new int[26];
        int[] arr2=new int[26];
        if(word1.length()!=word2.length()) return false;
        for(int i=0;i<word1.length();i++){
            char ch1=word1.charAt(i);
            char ch2=word2.charAt(i);
            arr2[ch2 - 'a']++;
            arr1[ch1 - 'a']++;
        }
        for(int i=0;i<26;i++){
            if(arr1[i]!=0 && arr2[i]!=0 || arr1[i]==0 && arr2[i]==0) continue;
            return false;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
        
    }
}