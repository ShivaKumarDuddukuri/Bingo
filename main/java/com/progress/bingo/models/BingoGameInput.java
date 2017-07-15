package com.progress.bingo.models;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by shivad on 14/6/17.
 */
public class BingoGameInput {

    private BingoCard bingoCard;
    private List<Integer> bingoNumbers;

    public BingoGameInput() {
        this.bingoCard = new BingoCard();
        this.bingoNumbers = new LinkedList<Integer>();
    }

    public BingoGameInput(BingoCard bingoCard, List<Integer> bingoNumbers) {
        this.bingoCard = bingoCard;
        this.bingoNumbers = bingoNumbers;
    }


    public BingoCard getBingoCard() {
        return bingoCard;
    }

    public void setBingoCard(BingoCard bingoCard) {
        this.bingoCard = bingoCard;
    }

    public List<Integer> getBingoNumbers() {
        return bingoNumbers;
    }

    public void setBingoNumbers(List<Integer> bingoNumbers) {
        this.bingoNumbers = bingoNumbers;
    }
}
