class Solution {
    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c)!= -1;
    }
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray(); 
        int low = 0;
        int high = chars.length - 1;
        while (low < high) {
            if (isVowel(chars[low])) {
                if (isVowel(chars[high])) {
                    char temp = chars[low];
                    chars[low] = chars[high];
                    chars[high] = temp;
                    low++;
                    high--;
                } else {
                    high--;
                }
            } else {
                low++;
            }
        }
        return new String(chars);
    }
}