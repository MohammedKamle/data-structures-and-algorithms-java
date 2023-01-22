package leetcode;

import java.util.HashSet;
import java.util.Set;

//https://www.youtube.com/watch?v=Pl7mMcBm2b8&t=289s

public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char currentValue = board[i][j];
                if (currentValue != '.') {
                    if (!seen.add(currentValue + " found in row " + i) ||
                            !seen.add(currentValue + "found in col " + j) ||
                            !seen.add(currentValue + "found in cube " + i / 3 + "-" + j / 3)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

}
