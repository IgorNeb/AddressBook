package sample;

import javafx.collections.ListChangeListener;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    private CollectionAdressBook collAdress = new CollectionAdressBook();

    @FXML
    private Button btnAdd;

    @FXML
    private Button btnDell;

    @FXML
    private Button btnSrch;

    @FXML
    private Button btnUp;

    @FXML
    private TableView teble;

    @FXML
    private TableColumn<Person, String> ColumnN;

    @FXML
    private TableColumn<Person, String> columnT;

    @FXML
    private Label lablsum;

    @FXML
    private void initialize(){
        ColumnN.setCellValueFactory(new PropertyValueFactory<Person, String>("name"));
        columnT.setCellValueFactory(new PropertyValueFactory<Person, String>("tel"));

        collAdress.fillData();

        teble.setItems(collAdress.getPersonList());

        collAdress.getPersonList().addListener(new ListChangeListener<Person>() {
            @Override
            public void onChanged(Change<? extends Person> c) {
                //countlable();
            }
        }
        );

    }

    private void countlable(){
        lablsum.setText("Summ = " + collAdress.getPersonList().size());
    }


    public void showAdd(ActionEvent actionEvent) {

        try {
            Stage stage = new Stage();
            Pane root = (Pane) FXMLLoader.load(getClass().getResource("add.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setMinHeight(50);
            stage.setMinWidth(300);
            stage.setResizable(false);
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(((Node) actionEvent.getSource()).getScene().getWindow());
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
