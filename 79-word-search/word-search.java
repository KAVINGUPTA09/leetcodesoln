class Solution {

    public boolean exists(char[][] board, char[] word,
                          int row, int col, int index) {

        // Base case
        if(index == word.length) {
            return true;
        }

        // Boundary check
        if(row < 0 || row >= board.length ||
           col < 0 || col >= board[0].length) {
            return false;
        }

        // Character match
        if(board[row][col] != word[index]) {
            return false;
        }

        // Mark visited
        char ch = board[row][col];
        board[row][col] = '*';

        // 4 directions
        if(exists(board, word, row + 1, col, index + 1) ||
           exists(board, word, row - 1, col, index + 1) ||
           exists(board, word, row, col + 1, index + 1) ||
           exists(board, word, row, col - 1, index + 1)) {
            return true;
        }

        // Backtrack
        board[row][col] = ch;

        return false;
    }

    public boolean exist(char[][] board, String word) {

        char[] arr = word.toCharArray();

        for(int i = 0; i < board.length; i++) {

            for(int j = 0; j < board[0].length; j++) {

                if(exists(board, arr, i, j, 0)) {
                    return true;
                }
            }
        }

        return false;
    }
}