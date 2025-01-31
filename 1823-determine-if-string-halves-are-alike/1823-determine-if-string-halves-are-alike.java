class Solution {
    public boolean isVowel(char ch) {
        // Use single quotes for characters, not double quotes
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

    public boolean halvesAreAlike(String s) {
        int i = 0;
        int vcount1 = 0, ccount1 = 0;
        int vcount2 = 0, ccount2 = 0;
        int n = s.length();
        while (i < n / 2) {
            char alpha = s.charAt(i);
            if (isVowel(alpha)) vcount1++;
            else ccount1++;
            i++;
        }
        while (i < n) {  
            char alpha1 = s.charAt(i);
            if (isVowel(alpha1)) vcount2++;
            else ccount2++;
            i++;
        }
        return vcount1 == vcount2 && ccount1 == ccount2;
    }
}
