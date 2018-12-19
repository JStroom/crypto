package crypto;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class CryptoController implements Initializable {

    @FXML
    private TextField plainTextField;

    @FXML
    private TextField cipherTextField;

    public CryptoController() {
        System.out.println("construct");
    }



    @FXML
    protected void handleSubmitButtonAction(ActionEvent event) {
        System.out.println("button pressed");
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("initialize");
        plainTextField.setText("abcdefghijklmnopqrstuvwxyz");
    }
}
