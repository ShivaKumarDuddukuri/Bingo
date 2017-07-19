package com.shiva.bingo.search;

/**
 * Created by shivad on 14/6/17.
 */
public class RowWiseSearch {

    private int cells[][];

    public RowWiseSearch(int[][] cells) {
        this.cells = cells;
    }

    public int searchRowWiseForColumn(int column, int value, int maxRowCount) {
        for (int i = 0; i < maxRowCount; i++) {
            if (cells[i][column] == value) {
                return i;
            }
        }
        return -1;
    }
}
