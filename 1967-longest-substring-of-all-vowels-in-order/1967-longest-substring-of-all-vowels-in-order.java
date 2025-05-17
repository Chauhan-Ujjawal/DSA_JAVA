class Solution {
    public int longestBeautifulSubstring(String word) {
        int maxLength = 0;
        int start = 0;
        int vowelStage = -1; 
        String vowels = "aeiou";
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == 'a') {
                if (vowelStage == -1 || word.charAt(i - 1) > 'a') {
                    vowelStage = 0;
                    start = i;
                }
            } else if (vowelStage >= 0 && vowelStage < 4 && ch == vowels.charAt(vowelStage + 1)) {
                vowelStage++;
            } else if (vowelStage >= 0 && ch == vowels.charAt(vowelStage)) {
            } else {
                vowelStage = (ch == 'a') ? 0 : -1;
                start = i;
            }
            if (vowelStage == 4) {
                maxLength = Math.max(maxLength, i - start + 1);
            }
        }
        return maxLength;
    }
}
