class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int index = 0;
        while (index < words.length) {
            int totalChars = words[index].length();
            int last = index + 1;
            while (last < words.length) {
                if (totalChars + 1 + words[last].length() > maxWidth) break;
                totalChars += 1 + words[last].length();
                last++;
            }
            StringBuilder sb = new StringBuilder();
            int gaps = last - index - 1;
            if (last == words.length || gaps == 0) {
                for (int i = index; i < last; i++) {
                    sb.append(words[i]);
                    if (i != last - 1) sb.append(" ");
                }
                int remaining = maxWidth - sb.length();
                while (remaining-- > 0) sb.append(" ");
            } else {
                int spaces = (maxWidth - totalChars) / gaps;
                int extra = (maxWidth - totalChars) % gaps;
                for (int i = index; i < last - 1; i++) {
                    sb.append(words[i]);
                    sb.append(" ");
                    for (int s = 0; s < spaces; s++) sb.append(" ");
                    if (extra-- > 0) sb.append(" ");
                }
                sb.append(words[last - 1]);
            }
            result.add(sb.toString());
            index = last;
        }
        return result;
    }
}
