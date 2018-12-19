package crypto;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class CryptoController implements Initializable {

    @FXML
    private TableView tableViewPlainText;

    @FXML
    protected void handleSubmitButtonAction(ActionEvent event) {
        System.out.println("button pressed");
        //actiontarget.setText("Sign in button pressed");
    }

    public void initTableModel() {
        Character[] characters = {'a', 'b'};
        List<Character> plainCipherList = Arrays.asList(characters);
        ObservableList<Character> plainCiphers = FXCollections.observableList(plainCipherList);
        tableViewPlainText.setItems(plainCiphers);
//        tableViewPlainText.setText("mytext");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Character[] characters = {'a', 'b'};
        List<Character> plainCipherList = Arrays.asList(characters);
        ObservableList<Character> plainCiphers = FXCollections.observableList(plainCipherList);
        //tableViewPlainText.setItems(plainCiphers);
    }
}
