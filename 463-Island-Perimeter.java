class Solution {
    public int islandPerimeter(int[][] grid) {
        int rows = grid.length; // finding length of rows
        int columns = grid[0].length; // finding length of columns
        int count = 0; // to hold the perimeter count

        // iterate through each cell in the grid
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                // check if the current cell is land (1)
                if (grid[i][j] == 1) {
                    // check the four possible edges
                    // up
                    if (i == 0 || grid[i - 1][j] == 0) {
                        count++; // count the edge if it's on the boundary or adjacent to water
                    }
                    // down
                    if (i == rows - 1 || grid[i + 1][j] == 0) {
                        count++;
                    }
                    // left
                    if (j == 0 || grid[i][j - 1] == 0) {
                        count++;
                    }
                    // right
                    if (j == columns - 1 || grid[i][j + 1] == 0) {
                        count++;
                    }
                }
            }
        }
        return count; // return the total perimeter count
    }
}
