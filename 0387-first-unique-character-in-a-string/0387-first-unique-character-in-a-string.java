class Solution {
    public int firstUniqChar(String s) {
        int[] Count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            Count[c - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (Count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1; 
    }
}
