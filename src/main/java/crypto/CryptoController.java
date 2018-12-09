package crypto;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;

public class CryptoController {

    @FXML
    private Text buttonDecypher;

    @FXML
    private Text buttonEncypher;

    @FXML
    private TextArea textAreaUnencrypted;

    @FXML
    private TextArea textAreaPlainText;

    @FXML
    protected void handleSubmitButtonAction(ActionEvent event) {
        System.out.println("button pressed");
        //actiontarget.setText("Sign in button pressed");
    }

}
