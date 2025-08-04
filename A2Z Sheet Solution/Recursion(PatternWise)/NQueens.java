import java.util.ArrayList;
import java.util.List;

public class NQueens {


    public List<List<String>> solveNQueens(int n) {

        List<List<String>> ans = new ArrayList<>();

        List<String> board = new ArrayList<>();

        String s = ".".repeat(n);   // Repeats "." n times

        for (int i = 0; i < n; i++) {
            board.add(s);
        }


        func(0, ans, board);
        return ans;
    }



    public void func(int col, List<List<String>> ans, List<String> board) {

        if (col == board.size()) {
            ans.add(new ArrayList<>(board));
            return;
        }

        // Try placing a queen in each row for the current column
        for (int row = 0; row < board.size(); row++) {

            if (safe(board, row, col)) {

                char[] charArray = board.get(row).toCharArray();
                charArray[col] = 'Q';
                board.set(row, new String(charArray));

                // Recursively place queens in the next columns
                func(col + 1, ans, board);

                // Remove the queen and backtrack
                charArray[col] = '.';
                board.set(row, new String(charArray));

            }
        }
    }


    // We build the board column by column (left to right),
    // so we only need to check same row left-side, upper-left and lower-left diagonals.
    public boolean safe(List<String> board, int row, int col) {

        int r = row, c = col;

        // Check upper left diagonal
        while (r >= 0 && c >= 0) {
            if (board.get(r).charAt(c) == 'Q') return false;
            r--;
            c--;
        }

        // Reset to the original position
        r = row;
        c = col;



        // Check left side
        while (c >= 0) {
            if (board.get(r).charAt(c) == 'Q') return false;
            c--;
        }

        // Reset to the original position
        r = row;
        c = col;



        // Check lower left diagonal
        while (r < board.size() && c >= 0) {
            if (board.get(r).charAt(c) == 'Q') return false;
            r++;
            c--;
        }


        return true;

    }

}
