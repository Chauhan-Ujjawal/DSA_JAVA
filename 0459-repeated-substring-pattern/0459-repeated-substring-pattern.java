class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();

        for (int i = 1; i <= len / 2; i++) { //
            if (len % i == 0) { // Check if i is a factor of length
                String sub = s.substring(0, i); // Get substring
                StringBuilder result = new StringBuilder();

                for (int j = 0; j < len / i; j++) {
                    result.append(sub); // Append substring repeatedly
                }

                if (result.toString().equals(s)) {
                    return true; // Found a valid repeating substring
                }
            }
        }
        return false; // No repeating pattern found
    }
}
