package tictactoe;

import java.util.List;

public class TicTacToeModel {
    String previousSymbol = "O";

    String symbol = "X";


    String getPlayerSymbol() {
        if (previousSymbol.equals("X")) {
            previousSymbol = "O";
            return "O";
        } else {
            previousSymbol = "X";
            return "X";
        }
    }
    void noChangeSymbol() {
        if (symbol.equals("X")) {
            symbol.equals(symbol);
        }
    }
    public void getWinnerIfExist(List<String> positionValues) {

    }
}