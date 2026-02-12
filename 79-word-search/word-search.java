class Solution {
    public boolean exist(char[][] board, String word) {
        int r = board.length;
        int c = board[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (board[i][j] == word.charAt(0) && helper(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean helper(char[][] board, String word, int i, int j, int c) {
        if (c == word.length()) {
            return true;
        }
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(c)) {
            return false;
        }
        char t = board[i][j];
        board[i][j] = ' ';
        boolean found = helper(board, word, i + 1, j, c + 1) || 
                        helper(board, word, i - 1, j, c + 1) || 
                        helper(board, word, i, j + 1, c + 1) || 
                        helper(board, word, i, j - 1, c + 1);
        board[i][j] = t;

        return found;
    }
}