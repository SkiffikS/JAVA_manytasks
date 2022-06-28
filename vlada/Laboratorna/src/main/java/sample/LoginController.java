package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
public class LoginController {
    public static String password;
    public static String login;
    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private TextField login_field2;
    @FXML
    private PasswordField password_field2;
    @FXML
    private Button signup_button;

    @FXML
    void initialize() {
        signup_button.setOnAction(event ->
        {
            if(password_field2.getText().equals(password)&&login_field2.getText().equals(login))
            {
                signup_button.getScene().getWindow().hide();
                FXMLLoader fxmlLoader3 = new FXMLLoader();
                fxmlLoader3.setLocation(getClass().getResource("/sample/final.fxml"));
                try {
                    fxmlLoader3.load();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                Parent root = fxmlLoader3.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.show();
            }
        });
    }
}
