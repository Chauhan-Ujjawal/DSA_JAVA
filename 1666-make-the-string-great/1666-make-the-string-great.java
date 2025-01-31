class Solution {
    public String makeGood(String s) {
        StringBuilder str = new StringBuilder(s);       

        for (int i = 0; i < str.length() - 1;) { 
            char current = str.charAt(i);
            char next = str.charAt(i + 1);
            if (Math.abs(current - next) == 32) {  
                str.deleteCharAt(i);  
                str.deleteCharAt(i);   
                if (i > 0) {
                    i--;  
                }
            } else {
                i++; 
            }
        }      
        
        return str.toString();
    }
}
