package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class FinalController {

    public static String name;
    public static String lname;
    public static String login;
    public static String sex;
    public static String citi;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField city1;

    @FXML
    private Button close;

    @FXML
    private TextField lastname1;

    @FXML
    private TextField login_field3;

    @FXML
    private TextField name1;

    @FXML
    private TextField sex1;

    @FXML
    private Button button;
    public void onStart()
    {
        name1.setText(name);
        lastname1.setText(lname);
        login_field3.setText(login);
        sex1.setText(sex);
        city1.setText(citi);
    }
    @FXML
    void initialize() {
        close.setOnAction(event ->
        {
            close.getScene().getWindow().hide();
        });
    }


}


