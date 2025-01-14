class Solution {
    public boolean checkRecord(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        if(s.contains("LLL")) return false;
        for(int i=0;i<s.length();i++){
            char temp=s.charAt(i);
            freq.put(temp, freq.getOrDefault(temp, 0) + 1);
        }
        int A = freq.getOrDefault('A', 0);
        if( A<2) return true;
        return false; 
    }
}