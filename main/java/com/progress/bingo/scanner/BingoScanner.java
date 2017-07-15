package com.progress.bingo.scanner;

/**
 * Created by shivad on 14/6/17.
 */
public class BingoScanner {

    protected int cells[][];

    public BingoScanner(int[][] cells) {
        this.cells = cells;
    }

    public boolean isBingo(int rowNumber, int columnNumber) {
        if (new RowBingoScanner(cells).isBingo(rowNumber, columnNumber)) {
            return true;
        } else if (new ColumnBingoScanner(cells).isBingo(rowNumber, columnNumber)) {
            return true;
        }
        else if (new DiagonalBingoScanner(cells).isBingo(rowNumber, columnNumber)) {
            return true;
        }
        return false;
    }
}
