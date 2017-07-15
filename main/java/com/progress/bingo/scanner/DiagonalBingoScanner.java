package com.progress.bingo.scanner;

/**
 * Created by shivad on 14/6/17.
 */
public class DiagonalBingoScanner extends BingoScanner {

    public DiagonalBingoScanner(int[][] cells) {
        super(cells);
    }

    public boolean isBingo(int rowNumber, int columnNumber) {

        int maxRowCount = 5;
        int maxColCount = 5;


        // Direction 1
        for (int k = 0; k < maxRowCount; k++) {
            int tempLength = 0;
            for (int row = k, col = 0; row >= 0 && col < maxColCount; row--, col++) {
                if (cells[row][col] == -1) {
                    tempLength++;
                }
            }
            if (tempLength == 5) {
                return true;
            }
        }


        for (int k = 1; k < maxColCount; k++) {
            int tempLength = 0;
            for (int row = maxRowCount - 1, col = k; row >= 0 && col < maxColCount; row--, col++) {
                if (cells[row][col] == -1) {
                    tempLength++;
                }
            }
            if (tempLength == 5) {
                return true;
            }
        }



        // Direction 2
        for (int k = maxRowCount - 1; k >= 0; k--) {
            int tempLength = 0;
            for (int row = k, col = 0; row < maxRowCount && col < maxColCount; row++, col++) {
                if (cells[row][col] == -1) {
                    tempLength++;
                }
            }
            if (tempLength == 5) {
                return true;
            }
        }


        for (int k = 1; k < maxColCount; k++) {
            int tempLength = 0;
            for (int row = 0, col = k; row < maxRowCount && col < maxColCount; row++, col++) {
                if (cells[row][col] == -1) {
                    tempLength++;
                }
            }
            if (tempLength == 5) {
                return true;
            }
        }
        return false;
    }
}
