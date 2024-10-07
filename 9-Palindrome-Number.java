class Solution {
    public boolean isPalindrome(int x) {
                // Negative numbers are not palindromes
        if (x < 0) {
            return false;
        }

        // Convert the integer to a string
        String strX = String.valueOf(x);
        
        // Check if the string is the same forwards and backwards
        String reversedStrX = new StringBuilder(strX).reverse().toString();
        
        return strX.equals(reversedStrX);
        
    }
}