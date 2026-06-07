class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[] rows = new int[9];   // bitmask for each row
        int[] cols = new int[9];   // bitmask for each column
        int[] boxes = new int[9];  // bitmask for each 3x3 box

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                if (board[i][j] == '.') {
                    continue;
                }

                int digit = board[i][j] - '1'; // '1' -> 0, '9' -> 8
                int mask = 1 << digit;

                int boxIndex = (i / 3) * 3 + (j / 3);

                // If digit already exists in row, column, or box, invalid Sudoku
                if ((rows[i] & mask) != 0 ||
                    (cols[j] & mask) != 0 ||
                    (boxes[boxIndex] & mask) != 0) {
                    return false;
                }

                // Mark digit as seen
                rows[i] |= mask;
                cols[j] |= mask;
                boxes[boxIndex] |= mask;
            }
        }

        return true;
    }
}