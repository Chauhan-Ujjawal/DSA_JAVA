class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int j;
        StringBuilder result;
        
        for (int i = 1; i <= s.length() / 2; i++) { // Start from 1 instead of 0 to avoid empty substring
            result = new StringBuilder(s.substring(0, i)); // Extract substring
            j = 1; // Reset j for each new substring
            
            while (result.length() < s.length()) { // Ensure result doesn't exceed original length
                result.append(s.substring(0, i)); // Append the original substring, not itself
                j++;
            }
            
            if (result.toString().equals(s)) { // Check if it matches original string
                return true;
            }
        }
        return false;
    }
}
