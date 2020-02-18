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
    public String getWinnerIfExist(List<String> positionValues) {
        String winner = "";
        if (positionValues.get(0).equals(positionValues.get(1))
            && positionValues.get(2).equals(positionValues.get(1))
            && positionValues.get(0).equals(positionValues.get(2))) {
            winner = positionValues.get(0);
        } else if (positionValues.get(3).equals(positionValues.get(4))
                && positionValues.get(5).equals(positionValues.get(4))
                && positionValues.get(3).equals(positionValues.get(5))) {
            winner = positionValues.get(3);
        } else if (positionValues.get(6).equals(positionValues.get(7))
                && positionValues.get(8).equals(positionValues.get(7))
                && positionValues.get(6).equals(positionValues.get(8))) {
            winner = positionValues.get(6);
        } else if (positionValues.get(0).equals(positionValues.get(3))
                && positionValues.get(6).equals(positionValues.get(3))
                && positionValues.get(0).equals(positionValues.get(6))) {
            winner = positionValues.get(0);
        } else if (positionValues.get(1).equals(positionValues.get(4))
                && positionValues.get(7).equals(positionValues.get(4))
                && positionValues.get(1).equals(positionValues.get(7))) {
            winner = positionValues.get(1);
        } else if (positionValues.get(2).equals(positionValues.get(5))
                && positionValues.get(8).equals(positionValues.get(5))
                && positionValues.get(2).equals(positionValues.get(8))) {
            winner = positionValues.get(2);
        } else if (positionValues.get(0).equals(positionValues.get(4))
                && positionValues.get(8).equals(positionValues.get(4))
                && positionValues.get(0).equals(positionValues.get(8))) {
            winner = positionValues.get(0);
        } else if (positionValues.get(2).equals(positionValues.get(4))
                && positionValues.get(6).equals(positionValues.get(4))
                && positionValues.get(2).equals(positionValues.get(6))) {
            winner = positionValues.get(2);
        }

        if (!winner.equals("")) {
            System.out.println("Winner -> " + winner);


        }

        return winner;
    }
}