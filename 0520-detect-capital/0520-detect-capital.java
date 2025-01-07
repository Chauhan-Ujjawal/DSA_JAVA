class Solution {
    public boolean detectCapitalUse(String word) {
        boolean AllUpper = true;
        boolean AllLower = true; 
        boolean FirstUpper = true; 
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (!Character.isUpperCase(c)) {
                AllUpper = false;
            }
            if (!Character.isLowerCase(c)) {
                AllLower = false; 
            }
            if (i == 0) {
                if (!Character.isUpperCase(c)) {
                    FirstUpper = false;
                }
            } else {
                if (!Character.isLowerCase(c)) {
                    FirstUpper = false;
                }
            }
        }
        return AllUpper||AllLower||FirstUpper;       
    }
}