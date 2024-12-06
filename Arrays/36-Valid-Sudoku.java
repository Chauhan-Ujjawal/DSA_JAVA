import java.util.HashSet;

class Solution {
    public boolean Traversal(char[][] board, int sr, int er, int sc, int ec) {
        HashSet<Character> charset3 = new HashSet<>(); // HashSet to store characters
        for (int i = sr; i <= er; i++) {
            for (int j = sc; j <= ec; j++) {
                char num = board[i][j]; // Get the current character
                if (num != '.') { // Check only filled cells
                    if (charset3.contains(num)) return false; // Duplicate found
                    charset3.add(num); // Add the character to the set
                }
            }
        }
        return true; // Returning true if no duplicates are found
    }

    public boolean isValidSudoku(char[][] board) {
        // Validating rows
        for (int row = 0; row < 9; row++) {
            HashSet<Character> charset = new HashSet<>();
            for (int col = 0; col < 9; col++) {
                char num = board[row][col]; // Get the current character
                if (num == '.') {
                    continue; // Skip empty cells
                } else if (charset.contains(num)) {
                    return false; // Duplicate found in the row
                }
                charset.add(num); // Add the character to the set
            } 
        }

        // Validating columns
        for (int col = 0; col < 9; col++) {
            HashSet<Character> charset1 = new HashSet<>();
            for (int row = 0; row < 9; row++) {
                char num = board[row][col]; // Get the current character
                if (num == '.') {
                    continue; // Skip empty cells
                } else if (charset1.contains(num)) {
                    return false; // Duplicate found in the column
                }
                charset1.add(num); // Add the character to the set
            }
        }

        // Validating sub-boxes
        for (int sr = 0; sr < 9; sr += 3) { // Increase by 3 to check each sub-box
            for (int sc = 0; sc < 9; sc += 3) {
                if (!Traversal(board, sr, sr + 2, sc, sc + 2)) {
                    return false; // Invalid sub-box found
                }
            }
        }
        return true; // Valid Sudoku
    }
}
