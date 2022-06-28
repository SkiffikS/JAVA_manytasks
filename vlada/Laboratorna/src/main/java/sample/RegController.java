package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class RegController {
    @FXML
    private RadioButton checkman;

    @FXML
    private RadioButton checkwoman;

    @FXML
    private TextField city;

    @FXML
    private TextField lastname;

    @FXML
    private TextField login_field;

    @FXML
    private TextField name;

    @FXML
    private PasswordField password_field;

    @FXML
    private Button button;

    @FXML
    private Button registration;
    private static String sex;
    public void onSelectedMan(){
        sex="Чоловік";
    }
    public void onSelectedWoman(){
        sex="Жінка";
    }
    @FXML
    void initialize() {
        registration.setOnAction(event ->
        {
            FinalController.name = name.getText();
            FinalController.lname = lastname.getText();
            FinalController.login = login_field.getText();
            LoginController.password = password_field.getText();
            LoginController.login = login_field.getText();
            FinalController.sex = sex;
            FinalController.citi = city.getText();
            registration.getScene().getWindow().hide();
            FXMLLoader fxmlLoader2 = new FXMLLoader();
            fxmlLoader2.setLocation(getClass().getResource("/sample/login.fxml"));
            try{
                fxmlLoader2.load();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Parent root = fxmlLoader2.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();

        });
    }

}