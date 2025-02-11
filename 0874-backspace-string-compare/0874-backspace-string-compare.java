class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder s1 = processString(s);
        StringBuilder t2 = processString(t);
        return s1.toString().equals(t2.toString());       
    }
    private StringBuilder processString(String str) {
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c != '#') {
                result.append(c);
            } else if (result.length() > 0) {
                result.deleteCharAt(result.length() - 1);
            }
        }
        return result;
    }
}