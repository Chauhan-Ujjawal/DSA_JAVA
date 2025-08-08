class Solution {
    public char kthCharacter(long k, int[] operations) {
        int m = (int) Math.ceil(Math.log(k) / Math.log(2));
        long n = 1L << m;
        int inc = 0;

        for (int i = m - 1; i >= 0; --i) {
            long half = 1L << i;
            if (k > half) {
                k -= half;
                if (operations[i] == 1) {
                    inc++;
                }
            }
        }

        return (char)('a' + (inc % 26));
    }
}
