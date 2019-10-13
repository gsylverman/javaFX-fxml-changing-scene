package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    public GridPane grid;

    public void mainFaceva(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("other.fxml"));
        Parent layout = fxmlLoader.load();
        Scene scene = grid.getScene();
        scene.setRoot(layout);
    }
}
