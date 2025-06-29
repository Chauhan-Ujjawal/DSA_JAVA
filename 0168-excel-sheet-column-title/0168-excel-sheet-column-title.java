class Solution {
    public String convertToTitle(int columnNumber) {
        int n = columnNumber ;
        StringBuilder result = new StringBuilder();
        while (n > 0) {
            n--;
            char ch = (char) ('A' + (n % 26));
            result.insert(0, ch); 
            n /= 26;
        }
        return result.toString();
        
    }
}