package com.shiva.bingo.main;

import com.progress.bingo.models.BingoGameInput;
import com.progress.bingo.models.BingoPlayer;
import com.progress.bingo.util.FileReaderUtil;

import java.io.IOException;
import java.util.List;

/**
 * Created by shivad on 14/6/17.
 */
public class Test {
    public static void main(String args[]) {
        List<BingoGameInput> bingoGameInputList = null;
        try {
            bingoGameInputList = FileReaderUtil.readFile("input.txt");
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        for (BingoGameInput bingoGameInput : bingoGameInputList) {
            BingoPlayer player = new BingoPlayer(bingoGameInput);
            System.out.println("BINGO after " + player.play() + " numbers announced");
        }


    }
}
