class Solution {
    static StringBuilder sb = new StringBuilder();
    static {
        sb.append("a");
    }
    public char kthCharacter(int k) {
        if (sb.length() >= k) {
            return sb.charAt(k - 1);
        }
        int len = sb.length();
        for (int i = 0; i < len; i++) {  
            char c = sb.charAt(i);
            char nextChar = (char) ((c - 'a' + 1) % 26 + 'a');
            sb.append(nextChar);
        }
        return kthCharacter(k); 
    }
}
