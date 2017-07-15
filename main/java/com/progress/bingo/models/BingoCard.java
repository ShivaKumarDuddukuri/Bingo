package com.progress.bingo.models;

/**
 * Created by shivad on 14/6/17.
 */
public class BingoCard {

    private int cells[][];

    public BingoCard() {
        cells = new int[5][5];
    }

    public BingoCard(int[][] cells) {
        this.cells = cells;
    }

    public int[][] getCells() {
        return cells;
    }

    public void setCells(int[][] cells) {
        this.cells = cells;
    }

    public void updateCell(int row,int column,int value){
        cells[row][column]=value;
    }
}
