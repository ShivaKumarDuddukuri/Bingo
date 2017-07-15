package com.progress.bingo.models;

import com.progress.bingo.exception.BingoException;
import com.progress.bingo.scanner.BingoScanner;
import com.progress.bingo.search.RowWiseSearch;

import java.util.List;

/**
 * Created by shivad on 14/6/17.
 */
public class BingoPlayer {

    private BingoGameInput bingoGameInput;

    public BingoPlayer(BingoGameInput bingoGameInput) {
        this.bingoGameInput = bingoGameInput;
    }

    public BingoGameInput getBingoGameInput() {
        return bingoGameInput;
    }

    public void setBingoGameInput(BingoGameInput bingoGameInput) {
        this.bingoGameInput = bingoGameInput;
    }

    public int play() throws BingoException {

        BingoCard bingoCard = bingoGameInput.getBingoCard();
        final List<Integer> bingoNumberList = bingoGameInput.getBingoNumbers();

        int bingoNumbersCount = 0;
        int valOccurCount = 0;

        for (Integer bingoNumber : bingoNumberList) {

            int columnNumber = (bingoNumber-1) / 15;
            int rowNumber = new RowWiseSearch(bingoCard.getCells()).searchRowWiseForColumn(columnNumber, bingoNumber, 5);
            int val = -1;
            bingoNumbersCount++;

            if (rowNumber != -1) {
                bingoCard.updateCell(rowNumber, columnNumber, -1);
                if (valOccurCount < 5) {
                    valOccurCount++;
                    continue;
                } else {
                    if (new BingoScanner(bingoCard.getCells()).isBingo(rowNumber, columnNumber)) {
                        return bingoNumbersCount;
                    }
                }
            }

        }

        return -1;

    }
}
