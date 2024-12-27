class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] Arr = new int[26]; 
        for (int i = 0; i < magazine.length(); i++) {
            Arr[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            if (Arr[c - 'a'] == 0) {
                return false;
            }
            Arr[c - 'a']--;
        }
        return true; 
    }
}