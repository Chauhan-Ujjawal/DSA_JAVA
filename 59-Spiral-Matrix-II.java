class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int count = 1;
        int left = 0, top = 0;
        int right = n - 1, bottom = n - 1;

        while (left <= right && top <= bottom) {
            // Fill top row
            for (int i = left; i <= right; i++) {
                res[top][i] = count;
                count++;
            }
            top++;

            // Fill right column
            for (int i = top; i <= bottom; i++) {
                res[i][right] = count;
                count++;
            }
            right--;

            // Fill bottom row (if there are rows remaining)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    res[bottom][i] = count;
                    count++;
                }
                bottom--;
            }

            // Fill left column (if there are columns remaining)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    res[i][left] = count;
                    count++;
                }
                left++;
            }
        }

        return res;
    }
}
