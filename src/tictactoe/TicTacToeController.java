package tictactoe;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class TicTacToeController {
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
        Button source = (Button) event.getSource();
        if (source.getText().equals("")) {
            System.out.println("Pressed -> " + source.getId());
            source.setText(model.getPlayerSymbol());
        }
    }
}
