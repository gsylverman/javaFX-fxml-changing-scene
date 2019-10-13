package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class OtherControler {
    public AnchorPane anchor;
    public Label label;
    public TextField text;

    public void faCeva(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("sample.fxml"));
        Parent layout = fxmlLoader.load();

        Scene scene = anchor.getScene();
        scene.setRoot(layout);
    }

    public void schimba(ActionEvent actionEvent) {

        label.setText(text.getText());
    }
}
