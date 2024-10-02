
class Solution {
    public void setZeroes(int[][] matrix) {
        // Get the number of rows (m) and columns (n)
        int m = matrix.length;
        int n = matrix[0].length;

        List<Integer> list = new ArrayList<>();
        boolean[] row = new boolean[m];
        boolean[] column = new boolean[n];

        // First pass: mark the rows and columns that need to be set to zero
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;    // Mark this row
                    column[j] = true; // Mark this column
                }
            }
        }

        // Second pass: set the zeros based on the markers
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row[i] || column[j]) {
                    matrix[i][j] = 0; // Set the cell to zero
                }
            }
        }

        // Add the elements of the modified matrix to the list
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                list.add(matrix[i][j]);
            }
        }

        // Print the elements of the list
        for (Integer num : list) {
            System.out.print(num);
        }
    }
}
