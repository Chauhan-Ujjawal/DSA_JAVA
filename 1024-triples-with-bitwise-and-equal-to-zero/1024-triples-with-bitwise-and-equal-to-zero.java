class Solution {
    public int countTriplets(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int a : nums) {
            for (int b : nums) {
                int andVal = a & b;
                freq.put(andVal, freq.getOrDefault(andVal, 0) + 1);
            }
        }
        int res = 0;
        for (int c : nums) {
            for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
                if ((entry.getKey() & c) == 0) {
                    res += entry.getValue();
                }
            }
        }
        return res;
    }
}