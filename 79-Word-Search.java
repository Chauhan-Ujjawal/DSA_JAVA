class Solution {
    // ispresent function is a boolean function that will return boolean value
    public boolean ispresent(char[][] board, int i, int j, char[] word, int index) {
        // Check if we are out of bounds or the character doesn't match
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word[index] || board[i][j] == '*') {
            return false;
        }
        
        // If we've matched the last character, return true
        if (index == word.length - 1) {
            return true;
        }
        
        // Mark current character as visited
        char ch = board[i][j];
        board[i][j] = '*';
        
        // Moving in all four directions to check for the next character
        boolean res = ispresent(board, i + 1, j, word, index + 1) ||ispresent(board, i - 1, j, word, index + 1) ||ispresent(board, i, j + 1, word, index + 1) ||ispresent(board, i, j - 1, word, index + 1);
        
        // Restore the current character
        board[i][j] = ch;
        
        return res;
    }

    public boolean exist(char[][] board, String word) {
        // Convert the given word into a character array
        char[] wordarr = word.toCharArray();
        
        // Search for the first character of the word in the matrix
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == wordarr[0] && ispresent(board, i, j, wordarr, 0)) {
                    return true;
                }
            }
        }
        
        // If the word isn't found anywhere on the board, return false
        return false;
    }
}
