class Solution {
    public String decodeAtIndex(String s, int k) {
        long size=0;
        for (int i = 0; i < s.length(); i++) {
           char c = s.charAt(i); // Get character at index i
           if (Character.isDigit(c)) {
            size *= (c - '0'); // Expand size
            } 
            else {
                size++;
            }
        }  
        long p=k;    
        for(int i=s.length()-1;i>=0;i--){
            p=p%size;
            char c = s.charAt(i);
            if(p==0 && Character.isLetter(s.charAt(i))) return String.valueOf(s.charAt(i));
            if(Character.isDigit(c)){
                size=size/(c-'0');
            }
            else{
                size--;
            }

        }
        return "";
    }    
}