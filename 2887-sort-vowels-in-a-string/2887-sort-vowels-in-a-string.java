class Solution {
    private boolean isVowel(char c) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        return vowels.contains(c);
    }

    public String sortVowels(String s) {
        StringBuilder vowelsOnly = new StringBuilder();

        // Extract vowels
        for (int i = 0; i < s.length(); i++) { // Fixed: using s.length() instead of str.length()
            if (isVowel(s.charAt(i))) {
                vowelsOnly.append(s.charAt(i));
            }
        }

        // Convert to char array and sort
        char[] arr = vowelsOnly.toString().toCharArray(); // Fixed: Corrected variable name
        Arrays.sort(arr);

        // Insert sorted vowels back into the original string
        StringBuilder result = new StringBuilder(s); // Fixed: Strings are immutable, so we need a StringBuilder
        int len = 0;

        for (int i = 0; i < result.length(); i++) {
            if (isVowel(result.charAt(i))) {
                result.setCharAt(i, arr[len]); // Fixed: Replacing character at specific index
                len++;
            }
        }

        return result.toString(); // Fixed: Returning final sorted string
    }
}