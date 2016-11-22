package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        primaryStage.setTitle("Hello World");

        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.setMinHeight(450);
        primaryStage.setMinWidth(300);
        primaryStage.show();
    }

    public void testData(){
        CollectionAdressBook collBook = new CollectionAdressBook();
        collBook.fillData();
        collBook.printData();
    }


    public static void main(String[] args) {
        CollectionAdressBook collBook = new CollectionAdressBook();
        collBook.fillData();
        collBook.printData();

        launch(args);

    }
}
