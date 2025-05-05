class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        ArrayList<String> list = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i <= s.length() - 10; i++) { 
            StringBuilder sb = new StringBuilder();
            for (int k = 0; k < 10; k++) {
                sb.append(s.charAt(i + k));
            }
            String sub = sb.toString(); // Convert to string o
            if (set.contains(sub) && !list.contains(sub)) {
                list.add(sub);
            } else {
                set.add(sub);
            }
        }
        return list;
    }
}
