class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(strs);
        char[] pre=strs[0].toCharArray();
        char[] suf=strs[strs.length-1].toCharArray();
        for(int i=0;i<pre.length;i++){
            if(pre[i]!=suf[i]) break;
            ans.append(pre[i]);
        }
        return ans.toString();
    }
}