package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * Created by Nebo on 24.11.2016.
 */
public class ModelController {

    @FXML
    private TextField textN;
    @FXML
    private TextField textT;
    @FXML
    private Button buttAD;
    @FXML
    private Button butCen;


    public void buttonCencel(ActionEvent actionEvent) {
        Node sourse = (Node) actionEvent.getSource();
        Stage stage = (Stage) sourse.getScene().getWindow();
        stage.close();
    }
}
