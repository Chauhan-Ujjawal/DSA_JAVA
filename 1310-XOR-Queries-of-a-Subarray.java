class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = arr.length;
        int m = queries.length;
        int[] prefixXOR = new int[n];

        // Compute the prefix XOR array
        prefixXOR[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixXOR[i] = prefixXOR[i - 1] ^ arr[i];
        }

        // Prepare the result array for queries
        int[] result = new int[m];
        for (int i = 0; i < m; i++) {
            int left = queries[i][0];
            int right = queries[i][1];

            if (left == 0) {
                // If left is 0, we take prefixXOR[right] directly
                result[i] = prefixXOR[right];
            } else {
                // Otherwise, we calculate the result using the prefixXOR array
                result[i] = prefixXOR[right] ^ prefixXOR[left - 1];
            }
        }

        return result;
    }
}
