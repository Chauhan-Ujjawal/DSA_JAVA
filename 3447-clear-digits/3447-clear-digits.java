class Solution {
    public String clearDigits(String s) {
        StringBuilder sb = new StringBuilder(); 
        for (int i = 0; i < s.length(); i++) { 
            char ch = s.charAt(i);          
            if (Character.isLetter(ch)) {
                sb.append(ch);
            } else if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);  
            }
        }
        return sb.toString(); 
    }
}
