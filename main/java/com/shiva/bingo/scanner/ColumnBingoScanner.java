package com.shiva.bingo.scanner;

/**
 * Created by shivad on 14/6/17.
 */
public class ColumnBingoScanner extends BingoScanner {

    public ColumnBingoScanner(int[][] cells) {
        super(cells);
    }

    public boolean isBingo(int rowNumber, int columnNumber) {
        for (int i = 0; i < 5; i++) {
            if (cells[i][columnNumber] != -1) {
                return false;
            }
        }
        return true;
    }
}
