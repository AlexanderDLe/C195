package AlexanderLeC195.ViewController;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Login {
    @FXML private Label loginLabel;
    @FXML private Label errorLabel;
    @FXML private Label usernameLabel;
    @FXML private TextField usernameField;
    @FXML private Label passwordLabel;
    @FXML private TextField passwordField;
    @FXML private Button submitButton;

//    private static DatabaseConnector dbConnector;
//    private static ResourceBundle resourceBundle;
//
//    public void initialize() {
//        try {
//            resourceBundle = ResourceBundle.getBundle("Properties.Login", Locale.getDefault());
//            loginLabel.setText(resourceBundle.getString("Login"));
//            usernameLabel.setText(resourceBundle.getString("Username"));
//            passwordLabel.setText(resourceBundle.getString("Password"));
//            submitButton.setText(resourceBundle.getString("Submit"));
//        } catch (MissingResourceException exception) {
//            System.out.println("Resource Not Found.");
//        }
//    }
//
//    @FXML
//    private void LoginSubmit(ActionEvent event) throws SQLException {
//        String usernameValue = usernameField.getText();
//        String passwordValue = passwordField.getText();
//
//        int userID = queryUserID(usernameValue);
//        Parent root;
//        Stage stage;
//
//        User currentUser = new User();
//    }
//
//    private int queryUserID(String username) throws SQLException {
//        int userID = -1;
//
//        // Acquire Database Statement Object
//        Statement statement = DatabaseConnector.connection.createStatement();
//
//        // Create SQL Query String
//        String sqlStatement = "SELECT userID FROM user WHERE userName ='" + username + "'";
//
//        // Execute SQL Query
//        ResultSet result = statement.executeQuery(sqlStatement);
//
//        while (result.next()) {
//            userID = result.getInt("userId");
//        }
//
//        return userID;
//    }
}
