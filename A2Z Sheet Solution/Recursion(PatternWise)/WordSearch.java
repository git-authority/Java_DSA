class WordSearch {


    public boolean exist(char[][] board, String word) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                if (board[i][j] == word.charAt(0)) {

                    if (func(board, i, j, word, 0)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }



    private boolean func(char[][] board, int i, int j, String word, int k) {

        if (k == word.length()) {
            return true;
        }

        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || word.charAt(k) != board[i][j]) {
            return false;
        }

        // Temporarily mark the cell as visited
        char temp = board[i][j];
        board[i][j] = ' ';


        // The || operator is short-circuiting: the moment one of these recursive calls returns true,
        // the rest are not executed.
        boolean ans = func(board, i + 1, j, word, k + 1) ||         // Down
                      func(board, i - 1, j, word, k + 1) ||         // Up
                      func(board, i, j + 1, word, k + 1) ||         // Right
                      func(board, i, j - 1, word, k + 1);           // Left

        // Restore the original character in the cell
        board[i][j] = temp;

        return ans;
    }

};
