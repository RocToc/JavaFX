package tictactoe;

public class TicTacToeModel {
    String previousSymbol = "O";

    String getPlayerSymbol() {
        if (previousSymbol.equals("X")) {
            previousSymbol = "O";
            return "O";
        } else {
            previousSymbol = "X";
            return "X";
        }
    }
}