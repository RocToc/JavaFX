package tictactoe;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;
import java.util.List;

public class TicTacToeController {
    boolean end = true;
    @FXML
    Button button11;
    @FXML
    Button button12;
    @FXML
    Button button13;
    @FXML
    Button button21;
    @FXML
    Button button22;
    @FXML
    Button button23;
    @FXML
    Button button31;
    @FXML
    Button button32;
    @FXML
    Button button33;

    TicTacToeModel model = new TicTacToeModel();



    public void onPressButton(MouseEvent event) {
        {
        Button source = (Button) event.getSource();
        if (source.getText().equals("")) {
            System.out.println("Pressed -> " + source.getId());
            source.setText(model.getPlayerSymbol());
            }
        }

        List<String> positionValues = new ArrayList<>();
        positionValues.add(0, button11.getText());
        positionValues.add(1, button12.getText());
        positionValues.add(2, button13.getText());
        positionValues.add(3, button21.getText());
        positionValues.add(4, button22.getText());
        positionValues.add(5, button23.getText());
        positionValues.add(6, button31.getText());
        positionValues.add(7, button32.getText());
        positionValues.add(8, button33.getText());
        String winner = model.getWinnerIfExist(positionValues);

        if (winner != "") {
            button12.textProperty().setValue(winner);
            button21.textProperty().setValue("W");
            button22.textProperty().setValue("I");
            button23.textProperty().setValue("N");
            button11.textProperty().setValue("");
            button13.textProperty().setValue("");
            button31.textProperty().setValue("");
            button32.textProperty().setValue("");
            button33.textProperty().setValue("");

        }
    }
}
