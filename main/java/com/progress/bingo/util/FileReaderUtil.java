package com.progress.bingo.util;

import com.progress.bingo.models.BingoCard;
import com.progress.bingo.models.BingoGameInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by shivad on 14/6/17.
 */
public class FileReaderUtil {

    public static List<BingoGameInput> readFile(String filename) throws IOException {

        InputStream stream = ClassLoader.getSystemResourceAsStream(filename);
        BufferedReader buffer = new BufferedReader(new InputStreamReader(stream));
        List<BingoGameInput> bingoGameInputs = new LinkedList<BingoGameInput>();

        String line;
        int numberOfBingoGames = 0;
        int currentBingoGameNum = 0;
        int log10 = 0;
        String numberFormat;

        line = buffer.readLine();
        numberOfBingoGames = Integer.parseInt(line);
        line = buffer.readLine();

        while (currentBingoGameNum < numberOfBingoGames && line!= null) {

            BingoGameInput bingoGameInput = new BingoGameInput();
            List<Integer> bingoNumbers = null;
            BingoCard bingoCard = null;
            int size = -1;
            int row = 0;
            int currentBingoGameLineNum = 0;

            while(currentBingoGameLineNum < 5 && line !=null){

                String[] vals = line.trim().split("\\s+");

                if (bingoCard == null) {
                    size = vals.length;
                    bingoCard = new BingoCard(new int[size][size]);
                    log10 = (int) Math.floor(Math.log10(size * size)) + 1;
                }

                for (int col = 0; col < size; col++) {
                    bingoCard.getCells()[row][col] = Integer.parseInt(vals[col]);
                }
                row++;
                currentBingoGameLineNum++;
                line = buffer.readLine();
            }

            int bingoNumberCount = 0;

            while(bingoNumberCount < 75 && line !=null){
                if(bingoNumbers==null){
                    bingoNumbers = new LinkedList<Integer>();
                }
                String[] vals = line.trim().split("\\s+");
                size = vals.length;
                bingoNumberCount+=size;
                for (int col = 0; col < size; col++) {
                    bingoNumbers.add(Integer.parseInt(vals[col]));
                }
                line = buffer.readLine();
            }

            currentBingoGameNum++;
            bingoGameInput.setBingoNumbers(bingoNumbers);
            bingoGameInput.setBingoCard(bingoCard);
            bingoGameInputs.add(bingoGameInput);
        }

        return bingoGameInputs;
    }
}
